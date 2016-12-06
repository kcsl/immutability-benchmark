package immutability.harness.grader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.ensoftcorp.atlas.core.query.Q;
import com.ensoftcorp.atlas.core.script.Common;
import com.ensoftcorp.atlas.core.xcsg.XCSG;

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
		Q context = appWithoutPrimitives.nodesTaggedWithAny("READONLY", "POLYREAD", "MUTABLE")
				.nodesTaggedWithAny(XCSG.Field, XCSG.Parameter, XCSG.Identity, XCSG.ReturnValue, XCSG.ArrayComponents, XCSG.Initialization);

		// additionally because JPPA did not include constructors or initializers, niether did reiminfer and we won't either
		Q methodsToIgnore = Common.universe().nodesTaggedWithAny(XCSG.Constructor).union(Common.universe().methods("<init>"));
		
		// did they ignore static initializers???
//		methodsToIgnore = methodsToIgnore.union(Common.universe().methods("<clinit>"));
		
		context = context.difference(methodsToIgnore.contained());
		
		// divide the reported results into local variables and non local variables
		// we do this because the points-to based immutability analysis does not report mutable fields
		// and reiminfer oopsla 2012 paper does not specify which mutables and polyreads belong to fields
		// our polyread fields (non local) are counted as what reiminfer would call a mutable
		// our polyread locals are local variables that are polyread 
		Q contextLocals = context.difference(context.nodesTaggedWithAny(XCSG.Field, XCSG.Parameter, XCSG.Identity, XCSG.ReturnValue));
		Q contextNonLocals = context.difference(contextLocals);

		long readonlys = context.nodesTaggedWithAny("READONLY").eval().nodes().size();
		long polyreads = contextNonLocals.nodesTaggedWithAny("POLYREAD").eval().nodes().size();
		long mutables = contextLocals.nodesTaggedWithAny("POLYREAD").eval().nodes().size() + contextLocals.nodesTaggedWithAny("MUTABLE").eval().nodes().size();
		
		long refs = context.eval().nodes().size();
		long methods = app.difference(methodsToIgnore).nodesTaggedWithAny(XCSG.Method).eval().nodes().size();
		
		writer.write("References,Methods,READONLY,POLYREAD,MUTABLE\n");
		writer.write(refs + "," + methods + "," + readonlys + "," + polyreads + "," + mutables);
		
		writer.flush();
		writer.close();
	}
	
}
