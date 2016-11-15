package testcase;

import annotations.READONLY;

public class AGT015_ByteLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT015_ByteLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT015_ByteLiteral_ClassVariable test = new AGT015_ByteLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT015_ByteLiteral_ClassVariable.f = (byte) 0x01;
		System.out.println(test.toString());
	}

}
