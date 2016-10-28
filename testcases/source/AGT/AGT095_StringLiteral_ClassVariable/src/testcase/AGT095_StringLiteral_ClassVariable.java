package testcase;

import annotations.MUTABLE;

public class AGT095_StringLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT095_StringLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT095_StringLiteral_ClassVariable test = new AGT095_StringLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT095_StringLiteral_ClassVariable.f = "1";
		System.out.println(test.toString());
	}

}
