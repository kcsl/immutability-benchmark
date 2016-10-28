package testcase;

import annotations.MUTABLE;

public class AGT109_NullLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT109_NullLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT109_NullLiteral_ParameterInstanceVariable test = new AGT109_NullLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT109_NullLiteral_ParameterInstanceVariable p){
		p.f = null;
	}

}
