package testcase;

import annotations.READONLY;

public class AGT075_DoubleLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT075_DoubleLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT075_DoubleLiteral_ClassVariable test = new AGT075_DoubleLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT075_DoubleLiteral_ClassVariable.f = 1.0;
		System.out.println(test.toString());
	}

}
