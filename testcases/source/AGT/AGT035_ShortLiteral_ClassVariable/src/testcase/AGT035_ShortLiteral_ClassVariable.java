package testcase;

import annotations.MUTABLE;

public class AGT035_ShortLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT035_ShortLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT035_ShortLiteral_ClassVariable test = new AGT035_ShortLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT035_ShortLiteral_ClassVariable.f = (short) 1;
		System.out.println(test.toString());
	}

}
