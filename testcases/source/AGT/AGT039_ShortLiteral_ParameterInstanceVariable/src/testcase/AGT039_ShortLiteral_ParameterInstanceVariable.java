package testcase;

import annotations.MUTABLE;

public class AGT039_ShortLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT039_ShortLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT039_ShortLiteral_ParameterInstanceVariable test = new AGT039_ShortLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT039_ShortLiteral_ParameterInstanceVariable p){
		p.f = (short) 1;
	}

}
