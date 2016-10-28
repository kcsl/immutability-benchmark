package testcase;

import annotations.MUTABLE;

public class AGT015_ByteLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT015_ByteLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT015_ByteLiteral_ClassVariable test = new AGT015_ByteLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT015_ByteLiteral_ClassVariable.f = (byte) 0x01;
		System.out.println(test.toString());
	}

}
