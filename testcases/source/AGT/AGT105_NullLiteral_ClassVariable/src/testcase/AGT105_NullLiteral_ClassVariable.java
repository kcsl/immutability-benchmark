package testcase;

import annotations.READONLY;

public class AGT105_NullLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT105_NullLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT105_NullLiteral_ClassVariable test = new AGT105_NullLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT105_NullLiteral_ClassVariable.f = null;
		System.out.println(test.toString());
	}

}
