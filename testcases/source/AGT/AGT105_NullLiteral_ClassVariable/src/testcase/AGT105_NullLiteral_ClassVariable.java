package testcase;

import annotations.MUTABLE;

public class AGT105_NullLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT105_NullLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT105_NullLiteral_ClassVariable test = new AGT105_NullLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT105_NullLiteral_ClassVariable.f = null;
		System.out.println(test.toString());
	}

}
