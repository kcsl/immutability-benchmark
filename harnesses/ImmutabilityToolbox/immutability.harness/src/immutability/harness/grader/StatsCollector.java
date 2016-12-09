package immutability.harness.grader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import com.ensoftcorp.atlas.core.db.graph.Node;
import com.ensoftcorp.atlas.core.query.Q;
import com.ensoftcorp.atlas.core.script.Common;
import com.ensoftcorp.atlas.core.xcsg.XCSG;
import com.ensoftcorp.open.commons.utilities.DisplayUtils;
import com.ensoftcorp.open.pointsto.common.PointsToAnalysis;
import com.ensoftcorp.open.pointsto.log.Log;

public class StatsCollector {

	/**
	 * This method collects stats in a form comparable to ReImInfer's reported stats
	 * @param statsFile
	 * @throws IOException
	 */
	public static void collectStats(File statsFile) throws IOException {
		FileWriter writer = new FileWriter(statsFile);
		
		// ReImInfer restricts reported results to app (excludes libraries)
		Q app = com.ensoftcorp.open.commons.analysis.SetDefinitions.app();
		
		// ReImInfer does not report results for primitive types
		Q primitives = Common.universe().nodesTaggedWithAny(XCSG.Primitive);
		Q primitiveTypes = Common.universe().edgesTaggedWithAny(XCSG.TypeOf).predecessors(primitives);
		Q appWithoutPrimitives = app.difference(primitiveTypes);
		
		// the reported counts are READONLY, POLYREAD, and MUTABLE types for
		// fields, parameters, identities (implicit 'this' references), method returns, array components, and local variables
		// Note that local variables may be represented more than once in the Atlas dataflow graph, so we restrict our count
		// to Initialization nodes in order to make the counts comparable
		Q context = appWithoutPrimitives.nodesTaggedWithAny("READONLY", "POLYREAD", "MUTABLE");
//				.nodesTaggedWithAny(XCSG.Field, XCSG.Parameter, XCSG.Identity, XCSG.ReturnValue, XCSG.ArrayComponents, XCSG.Initialization);

		// additionally because JPPA did not include constructors or initializers, neither did reiminfer and we won't either
		Q methodsToIgnore = Common.universe().nodesTaggedWithAny(XCSG.Constructor);//.union(Common.universe().methods("<init>"));
		
		// did they ignore static initializers???
//		methodsToIgnore = methodsToIgnore.union(Common.universe().methods("<clinit>"));
		
		context = context.difference(methodsToIgnore.contained());
		
		// divide the reported results into local variables and non local variables
		// we do this because the points-to based immutability analysis does not report mutable fields
		// and reiminfer oopsla 2012 paper does not specify which mutables and polyreads belong to fields
		// our polyread fields (non local) are counted as what reiminfer would call a mutable
		// our polyread locals are local variables that are polyread 
		
		Q contextLocalsTemp = app.nodesTaggedWithAny(XCSG.Method).difference(methodsToIgnore).contained().intersection(context);
		Q contextLocals = contextLocalsTemp.nodesTaggedWithAny(XCSG.Initialization, XCSG.ArrayComponentInitialization, XCSG.Identity, XCSG.Parameter, XCSG.ReturnValue);
		Q contextNonLocals = context.difference(contextLocalsTemp);
		
		context = (contextLocals.union(contextNonLocals));
		
//		Q contextLocals = context.nodesTaggedWithAny(XCSG.Identity, XCSG.Initialization, XCSG.ArrayComponentInitialization).difference(context.nodesTaggedWithAny(XCSG.Field, XCSG.Parameter, XCSG.ReturnValue));
//		Q contextNonLocals = context.difference(contextLocals);

		long readonlys = context.nodesTaggedWithAny("READONLY").eval().nodes().size();
		long polyreads = contextNonLocals.nodesTaggedWithAny("POLYREAD").eval().nodes().size();
		long mutables = contextLocals.nodesTaggedWithAny("POLYREAD").eval().nodes().size() 
				+ context.nodesTaggedWithAny("MUTABLE").eval().nodes().size();
		
		long refs = context.eval().nodes().size();
		long methods = app.difference(methodsToIgnore).nodesTaggedWithAny(XCSG.Method).eval().nodes().size();
		long pureMethods = app.difference(methodsToIgnore).nodesTaggedWithAll(XCSG.Method, "PURE").eval().nodes().size();
		
		writer.write("References,Methods,PureMethods,PureMethodsPercentage,READONLY,READONLY Perecentage,POLYREAD,POLYREAD Percentage,MUTABLE,MUTABLE Percentage,POLYREAD+MUTABLE,POLYREAD+MUTABLE Percentage,TOTAL==REFERENCES\n");
		long total = (mutables+polyreads+readonlys);
		DecimalFormat format = new DecimalFormat("#.##");
		writer.write(refs + "," + methods + "," + pureMethods + "," + format.format((((double)pureMethods/(double)methods)*100.0)) + "%," 
				+ readonlys + "," + format.format((((double)readonlys/(double)refs)*100.0)) + "%," 
				+ polyreads + "," + format.format((((double)polyreads/(double)refs)*100.0)) + "%,"
				+ mutables + "," + format.format((((double)mutables/(double)refs)*100.0)) + "%,"
				+ (polyreads+mutables) + "," + format.format((((double)(polyreads+mutables)/(double)refs)*100.0)) + "%,"
				+ (total==refs));
		
		writer.flush();
		writer.close();
	}
	
	
	/**
	 * This method collects some stats on aliasing chains
	 * @param statsFile
	 * @throws IOException
	 */
	public static void collectAliasingStats(File statsFile) throws IOException {
		FileWriter writer = new FileWriter(statsFile);
		
		// chain length -> count
		HashMap<Long,Long> chainLengthFrequency = new HashMap<Long,Long>();
		
		// chain length -> frequency of mutation offsets
		HashMap<Long,HashMap<Long,Long>> chainMutations = new HashMap<Long,HashMap<Long,Long>>();
		
		Q app = com.ensoftcorp.open.commons.analysis.SetDefinitions.app();
		
		Q specialInstantiations = Common.universe().nodesTaggedWithAny(XCSG.Java.EnumConstant /*, XCSG.Literal*/).difference(Common.universe().nodesTaggedWithAny(XCSG.Null));
		Q objectInstantiations = Common.universe().nodesTaggedWithAny(XCSG.Instantiation, XCSG.ArrayInstantiation).union(specialInstantiations).intersection(app);
		Q instanceVariableWrittenEdges = Common.universe().edgesTaggedWithAny(XCSG.InstanceVariableWritten);
		Q instanceVariableAssignments = Common.universe().nodesTaggedWithAny(XCSG.InstanceVariableAssignment);
		for(Node objectInstantiation : objectInstantiations.intersection(app).eval().nodes()){
			for(String alias : PointsToAnalysis.getAliasTags(objectInstantiation)){
				Q aliasChain = app.edgesTaggedWithAll(XCSG.DataFlow_Edge);
				aliasChain = Common.universe().nodesTaggedWithAll(alias).induce(aliasChain);
				aliasChain = aliasChain.forward(objectInstantiations);
				Long aliasChainLength = aliasChain.nodesTaggedWithAny(XCSG.Assignment).eval().nodes().size();
				
				if(aliasChainLength >= 3 && !aliasChain.intersection(Common.universe().nodesTaggedWithAny(XCSG.InstanceVariable)).eval().nodes().isEmpty()){
					DisplayUtils.show(aliasChain, "Alias Chain Length >=3 With Field");
				}
				
				// increment the counter for alias chains of this length
				if(chainLengthFrequency.containsKey(aliasChainLength)){
					chainLengthFrequency.put(aliasChainLength, chainLengthFrequency.get(aliasChainLength) + 1);
				} else {
					chainLengthFrequency.put(aliasChainLength, 1L);
				}
				
//				Q aliases = Common.universe().nodesTaggedWithAny(alias);
//				Q mutatingAliases = instanceVariableWrittenEdges.predecessors(instanceVariableAssignments).intersection(aliases);
//				for(Node mutatingAlias : mutatingAliases.eval().nodes()){
//					Long distanceFromInstantiation = aliasChain.between(aliasChain.roots(), Common.toQ(mutatingAlias)).eval().edges().size();
//					if(chainMutations.containsKey(aliasChainLength)){
//						HashMap<Long,Long> counts = chainMutations.get(aliasChainLength);
//						if(counts.containsKey(distanceFromInstantiation)){
//							Long count = counts.get(distanceFromInstantiation) + 1;
//							counts.put(distanceFromInstantiation, count);
//						} else {
//							counts.put(distanceFromInstantiation, 1L);
//						}
//					} else {
//						HashMap<Long,Long> counts = new HashMap<Long,Long>();
//						counts.put(distanceFromInstantiation, 1L);
//						chainMutations.put(aliasChainLength, counts);
//					}
//				}
			}
			
//			boolean readonly = instanceVariableWrittenEdges.predecessors(instanceVariableAssignments).intersection(aliases).eval().nodes().isEmpty();
////			markMutableAliases(aliases, readonly);
//			if(objectInstantiation.taggedWith(XCSG.ArrayInstantiation)){
//				Node arrayInstantiation = objectInstantiation;
//				Q arrayMemoryModelAliases = Common.toQ(PointsToAnalysis.getArrayMemoryModelAliases(arrayInstantiation)).difference(objectInstantiations);
//				readonly = instanceVariableWrittenEdges.predecessors(instanceVariableAssignments).intersection(arrayMemoryModelAliases).eval().nodes().isEmpty();
//				// mutations to the array components mutate the array itself
////				markMutableAliases(aliases, readonly);
//			}
		}
		
		writer.write(chainLengthFrequency.toString() + "\n");
		writer.write(chainMutations.toString() + "\n");
		
		writer.write("Min Chain Length: " + getMin(chainLengthFrequency.keySet()) + "\n");
		writer.write("Max Chain Length: " + getMax(chainLengthFrequency.keySet()) + "\n");
		writer.write("Average Chain Length: " + getAverage(chainLengthFrequency.keySet()) + "\n");
		
//		Long.MAX_VALUE
		
		for(HashMap<Long,Long> offsets : chainMutations.values()){
			
		}
		
//		writer.write("Min Mutation Offset: " + getMin(chainLengthFrequency.keySet()) + "\n");
//		writer.write("Max Mutation Offset: " + getMax(chainLengthFrequency.keySet()) + "\n");
//		writer.write("Average Chain Length: " + getAverage(chainLengthFrequency.keySet()) + "\n");
		
		writer.flush();
		writer.close();
	}
	
	public static Long getMin(Collection<Long> values){
		Long min = Long.MAX_VALUE;
		for(Long v : values){
			if(min > v){
				min = v;
			}
		}
		return min;
	}
	
	public static Long getMax(Collection<Long> values){
		Long max = Long.MIN_VALUE;;
		for(Long v : values){
			if(max < v){
				max = v;
			}
		}
		return max;
	}
	
	public static Double getAverage(Collection<Long> values){
		double sum = 0;
		for(Long v : values){
			sum += v;
		}
		return sum / (double) values.size();
	}
}
