
public class AssignmentGraph {

	public static void main(String[] args){
		
		// constants must be on the RHS of an assignment
		Graph constants = new Graph();
		// anything marked final
		constants.addNode(new Node("FinalObject")); //final Foo o = new Foo();
		
//		constants.addNode(new Node("primitive")); // any primitive literal
		// primitives
		constants.addNode(new Node("ByteLiteral")); // (byte) 0x01
		constants.addNode(new Node("CharLiteral")); // '1'
		constants.addNode(new Node("ShortLiteral")); // (short) 1
		constants.addNode(new Node("IntLiteral")); // (int) 1
		constants.addNode(new Node("LongLiteral")); // 1L
		constants.addNode(new Node("FloatLiteral")); // 1.0F
		constants.addNode(new Node("DoubleLiteral")); // 1.0
		constants.addNode(new Node("BooleanLiteral")); // true
		// string literal
		constants.addNode(new Node("StringLiteral")); // \"1\"
		// null literal
		constants.addNode(new Node("NullLiteral"));
		// this reference
		constants.addNode(new Node("This"));
		// enums
		constants.addNode(new Node("Enum"));
		
		// variables may be LHS or RHS of an assignment
		Graph variables = new Graph();
		
		// local object variables
//		variables.addNode(new Node("local variable"));
//		variables.addNode(new Node("local variable array component"));
		
		// another objects instance variables
		variables.addNode(new Node("ObjectInstanceVariable", true));
		variables.addNode(new Node("ObjectInstanceVariableArrayComponent", true));
		
		// this objects instance variables
		variables.addNode(new Node("ThisInstanceVariable", true));
		variables.addNode(new Node("ThisInstanceVariableArrayComponent", true));
		
//		// this objects parents instance variables
//		variables.addNode(new Node("super instance variable", true));
//		variables.addNode(new Node("super instance variable array component, true"));
//		
//		// this objects parents parents instance variables
//		variables.addNode(new Node("super super instance variable, true"));
//		variables.addNode(new Node("super super instance variable array component, true"));
		
		variables.addNode(new Node("ClassVariable", true));
		variables.addNode(new Node("ClassVariableArrayComponent", true));
		
		Graph parameters = new Graph();
		parameters.addNode(new Node("Parameter", false));
		parameters.addNode(new Node("ParameterArrayComponent", true));
		parameters.addNode(new Node("ParameterInstanceVariable", true));
		parameters.addNode(new Node("ParameterInstanceVariableArrayComponent", true));
		
		// redundant, these can be accessed without a reference
//		parameters.addNode(new Node("ParameterClassVariable", true));
//		parameters.addNode(new Node("ParameterClassVariableArrayComponent", true));
		
//		parameters.addNode(new Node("overridden parameter"));
//		parameters.addNode(new Node("overridden overridden parameter"));
		
	
		// for now considering that assignments can't be made to returns, but returns can be assigned to variables or parameters
		Node ret = new Node("Return");
		
//		// returns be assigned to returns
//		ret.assignedTo(ret);
//		// parameters can be assigned to returns
//		for(Node parameter : parameters.nodes){
//			parameter.assignedTo(ret);
//		}
//		// constants can be assigned to returns
//		for(Node constant : constants.nodes){
//			constant.assignedTo(ret);
//		}
//		// variables can be assigned to returns
//		for(Node variable : variables.nodes){
//			variable.assignedTo(ret);
//		}
		
		// returns can be assigned to variables
		for(Node variable : variables.nodes){
			ret.assignedTo(variable);
		}
		// returns can be assigned to parameters
		for(Node parameter : parameters.nodes){
			ret.assignedTo(parameter);
		}
		
		// connect each variable node
		for(Node node1 : variables.nodes){
			for(Node node2 : variables.nodes){
				// note: node1 can be assigned to node2
				node1.assignedTo(node2);
				node2.assignedTo(node1);
			}
		}
		
		// connect each parameter node
		for(Node node1 : parameters.nodes){
			for(Node node2 : parameters.nodes){
				// note: node1 can be assigned to node2
				node1.assignedTo(node2);
				node2.assignedTo(node1);
			}
		}
		
		// constants can be assigned to variables
		for(Node constant : constants.nodes){
			for(Node variable : variables.nodes){
				constant.assignedTo(variable);
			}
		}
		
		// parameters can be assigned to variables
		for(Node parameter : parameters.nodes){
			for(Node variable : variables.nodes){
				parameter.assignedTo(variable);
			}
		}
		
		// variables can be assigned to parameters
		for(Node variable : variables.nodes){
			for(Node parameter : parameters.nodes){
				variable.assignedTo(parameter);
			}
		}
		
		// constants can be assigned to parameters
		for(Node constant : constants.nodes){
			for(Node parameter : parameters.nodes){
				constant.assignedTo(parameter);
			}
		}
		
		// build the final graph
		Graph assignments = new Graph();
		// add all the constants to the assignment graph
		for(Node constant : constants.nodes){
			assignments.addNode(constant);
		}
		// add all the variables to the assignment graph
		for(Node variable : variables.nodes){
			assignments.addNode(variable);
		}
		
		assignments.addNode(ret);
			
		// add all the parameters to the assignment graph
		for(Node parameter : parameters.nodes){
			assignments.addNode(parameter);
		}
		
		// print all possible pairs
		int test = 1;
		int numMutable = 0;
		int numReadonly = 0;
		for(Node rhs : assignments.nodes){
			for(Node lhs : rhs.decendants){
				if(lhs.isMutatation() /*&& !lhs.equals(rhs)*/){
					numMutable++;
					System.out.println("MUTABLE,AGT" + String.format("%03d", (test++)) + "_" + rhs.getName() + "_" + lhs.getName());
				} else {
					numReadonly++;
					System.out.println("READONLY,AGT" + String.format("%03d", (test++)) + "_" + rhs.getName() + "_" + lhs.getName());
				}
			}
		}
		System.out.println("Mutable = " + numMutable + ", Readonly = " + numReadonly);
	}
	
}
