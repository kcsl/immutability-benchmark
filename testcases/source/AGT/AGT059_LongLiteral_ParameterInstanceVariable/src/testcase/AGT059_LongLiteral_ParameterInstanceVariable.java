package testcase;

import annotations.MUTABLE;

public class AGT059_LongLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT059_LongLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT059_LongLiteral_ParameterInstanceVariable test = new AGT059_LongLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT059_LongLiteral_ParameterInstanceVariable p){
		p.f = 1L;
	}

}
