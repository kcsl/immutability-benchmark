package testcase;

import annotations.READONLY;

public class AGT095_StringLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT095_StringLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT095_StringLiteral_ClassVariable test = new AGT095_StringLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT095_StringLiteral_ClassVariable.f = "1";
		System.out.println(test.toString());
	}

}
