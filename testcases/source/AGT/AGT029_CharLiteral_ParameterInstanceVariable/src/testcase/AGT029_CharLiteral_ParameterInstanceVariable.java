package testcase;

import annotations.MUTABLE;

public class AGT029_CharLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT029_CharLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT029_CharLiteral_ParameterInstanceVariable test = new AGT029_CharLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT029_CharLiteral_ParameterInstanceVariable p){
		p.f = '1';
	}

}
