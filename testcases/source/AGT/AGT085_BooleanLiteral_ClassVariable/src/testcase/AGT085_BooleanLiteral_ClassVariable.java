package testcase;

import annotations.MUTABLE;

public class AGT085_BooleanLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT085_BooleanLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT085_BooleanLiteral_ClassVariable test = new AGT085_BooleanLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT085_BooleanLiteral_ClassVariable.f = true;
		System.out.println(test.toString());
	}

}
