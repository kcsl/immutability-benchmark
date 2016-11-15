package testcase;

import annotations.READONLY;

public class AGT085_BooleanLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT085_BooleanLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT085_BooleanLiteral_ClassVariable test = new AGT085_BooleanLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT085_BooleanLiteral_ClassVariable.f = true;
		System.out.println(test.toString());
	}

}
