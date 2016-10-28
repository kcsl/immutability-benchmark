package testcase;

import annotations.MUTABLE;

public class AGT069_FloatLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT069_FloatLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT069_FloatLiteral_ParameterInstanceVariable test = new AGT069_FloatLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT069_FloatLiteral_ParameterInstanceVariable p){
		p.f = 1.0F;
	}

}
