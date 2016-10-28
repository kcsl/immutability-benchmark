package testcase;

import annotations.MUTABLE;

public enum AGT125_Enum_ClassVariable {

	A,B;
	
	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		// using hashcode to avoid recursive stackoverflow
		return "AGT125_Enum_ClassVariable [f=" + f.hashCode() + "]";
	}
	
	public static void main(String[] args) {
		AGT125_Enum_ClassVariable test = AGT125_Enum_ClassVariable.A;
		System.out.println(test.toString());
		AGT125_Enum_ClassVariable.f = AGT125_Enum_ClassVariable.B;
		System.out.println(test.toString());
	}

}
