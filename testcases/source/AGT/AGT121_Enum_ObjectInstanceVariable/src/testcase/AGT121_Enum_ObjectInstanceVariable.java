package testcase;

import annotations.MUTABLE;

public enum AGT121_Enum_ObjectInstanceVariable {

	A,B;
	
	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT121_Enum_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT121_Enum_ObjectInstanceVariable test = AGT121_Enum_ObjectInstanceVariable.A;
		System.out.println(test);
		test.f = AGT121_Enum_ObjectInstanceVariable.B;
		System.out.println(test);
	}

}
