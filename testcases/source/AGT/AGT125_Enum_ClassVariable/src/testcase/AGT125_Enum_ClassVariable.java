package testcase;

import annotations.READONLY;

public enum AGT125_Enum_ClassVariable {

	A,B;
	
	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT125_Enum_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT125_Enum_ClassVariable test = AGT125_Enum_ClassVariable.A;
		System.out.println(test.toString());
		AGT125_Enum_ClassVariable.f = AGT125_Enum_ClassVariable.B;
		System.out.println(test.toString());
	}

}
