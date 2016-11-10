package immutability.harness.grader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

import com.ensoftcorp.atlas.core.db.graph.Node;
import com.ensoftcorp.atlas.core.query.Q;
import com.ensoftcorp.atlas.core.script.Common;
import com.ensoftcorp.atlas.core.xcsg.XCSG;

public class Grader {

	public static void score(File summaryFile) throws IOException {
		
		FileWriter summary = new FileWriter(summaryFile, true);
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			
			if(project.getName().equals("immutability.harness") || project.getName().equals("TestcaseBase") || project.getName().equals("RemoteSystemsTempFiles")){
				continue;
			}
			
			String testName = project.getName();
			Q test = Common.universe().nodesTaggedWithAny(XCSG.Type).selectNode(XCSG.name, testName);
			
			boolean passed = true;
			
			Q testFields = test.contained().nodesTaggedWithAny(XCSG.Field);
			
			String reason = "";
			String prefix = "";
			
			
			
			if(!testFields.intersection(getMutablesMarkedReadonly()).eval().nodes().isEmpty()){
				passed = false;
				for(Node f : testFields.intersection(getMutablesMarkedReadonly()).eval().nodes()){
					reason += (prefix + f.getAttr(XCSG.name) + " was mutated but reported as readonly");
					prefix = "; ";
					c1++;
				}
			}
			
			if(!testFields.intersection(getReadonlysMarkedMutable()).eval().nodes().isEmpty()){
				passed = false;
				for(Node f : testFields.intersection(getReadonlysMarkedMutable()).eval().nodes()){
					reason += (prefix + f.getAttr(XCSG.name) + " was readonly but reported as mutable");
					prefix = "; ";
					c2++;
				}
			}
			
			if(!testFields.intersection(getUntyped()).eval().nodes().isEmpty()){
				passed = false;
				for(Node f : testFields.intersection(getUntyped()).eval().nodes()){
					reason += (prefix + f.getAttr(XCSG.name) + " was untyped");
					prefix = "; ";
					c3++;
				}
			}
			
			summary.write(testName + "," + (passed ? "PASS" : ("FAIL," + reason)) + "\n");
		}
		
//		summary.write("Mutables Marked Readonly: " + c1 + "\n");
//		summary.write("Readonlys Marked Mutable: " + c2 + "\n");
//		summary.write("Untyped: " + c3 + "\n");
		
		summary.close();
		
		
	}
	
	/**
	 * Returns mutables that were marked readonly
	 * @return
	 */
	public static Q getMutablesMarkedReadonly(){
		Q annotatedMutables = Common.universe().selectNode("###annotation-raw-text", "@MUTABLE ");
		return annotatedMutables.nodesTaggedWithAny("READONLY");
	}
	
	/**
	 * Returns readonlys that were marked mutable
	 * @return
	 */
	public static Q getReadonlysMarkedMutable(){
		Q annotatedReadonlys = Common.universe().selectNode("###annotation-raw-text", "@READONLY ");
		return annotatedReadonlys.nodesTaggedWithAny("MUTABLE");
	}
	
	/**
	 * Returns untyped (failures in the constraints)
	 * @return
	 */
	public static Q getUntyped(){
		return Common.universe().nodesTaggedWithAll("UNTYPED", XCSG.Field);
	}
	
}
