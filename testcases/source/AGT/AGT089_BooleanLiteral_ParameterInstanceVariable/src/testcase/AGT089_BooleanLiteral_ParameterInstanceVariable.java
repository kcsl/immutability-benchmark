package testcase;

import annotations.MUTABLE;

public class AGT089_BooleanLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT089_BooleanLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT089_BooleanLiteral_ParameterInstanceVariable test = new AGT089_BooleanLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT089_BooleanLiteral_ParameterInstanceVariable p){
		p.f = true;
	}

}
