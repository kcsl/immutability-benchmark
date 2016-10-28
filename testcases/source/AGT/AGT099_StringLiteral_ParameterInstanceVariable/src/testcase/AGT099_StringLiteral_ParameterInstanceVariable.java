package testcase;

import annotations.MUTABLE;

public class AGT099_StringLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT099_StringLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT099_StringLiteral_ParameterInstanceVariable test = new AGT099_StringLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT099_StringLiteral_ParameterInstanceVariable p){
		p.f = "1";
	}

}
