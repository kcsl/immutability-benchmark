package testcase;

import annotations.MUTABLE;

public class AGT011_ByteLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT011_ByteLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT011_ByteLiteral_ObjectInstanceVariable test = new AGT011_ByteLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = (byte) 0x01;
		System.out.println(test);
	}

}
