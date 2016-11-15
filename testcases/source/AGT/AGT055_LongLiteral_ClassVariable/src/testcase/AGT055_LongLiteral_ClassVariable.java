package testcase;

import annotations.READONLY;

public class AGT055_LongLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT055_LongLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT055_LongLiteral_ClassVariable test = new AGT055_LongLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT055_LongLiteral_ClassVariable.f = 1L;
		System.out.println(test.toString());
	}

}
