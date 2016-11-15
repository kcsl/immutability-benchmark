package testcase;

import annotations.READONLY;

public class AGT025_CharLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT025_CharLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT025_CharLiteral_ClassVariable test = new AGT025_CharLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT025_CharLiteral_ClassVariable.f = '1';
		System.out.println(test.toString());
	}

}
