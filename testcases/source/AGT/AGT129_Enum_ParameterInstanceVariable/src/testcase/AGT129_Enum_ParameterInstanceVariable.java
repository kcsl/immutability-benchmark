package testcase;

import annotations.MUTABLE;

public enum AGT129_Enum_ParameterInstanceVariable {

	A,B;
	
	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT129_Enum_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT129_Enum_ParameterInstanceVariable test = AGT129_Enum_ParameterInstanceVariable.A;
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT129_Enum_ParameterInstanceVariable p){
		p.f = AGT129_Enum_ParameterInstanceVariable.B;
	}

}
