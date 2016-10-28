package testcase;

import annotations.MUTABLE;

public class AGT031_ShortLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT031_ShortLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT031_ShortLiteral_ObjectInstanceVariable test = new AGT031_ShortLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = (short) 1;
		System.out.println(test);
	}

}
