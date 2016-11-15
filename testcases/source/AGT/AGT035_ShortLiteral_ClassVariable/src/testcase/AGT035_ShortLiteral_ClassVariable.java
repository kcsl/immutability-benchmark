package testcase;

import annotations.READONLY;

public class AGT035_ShortLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT035_ShortLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT035_ShortLiteral_ClassVariable test = new AGT035_ShortLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT035_ShortLiteral_ClassVariable.f = (short) 1;
		System.out.println(test.toString());
	}

}
