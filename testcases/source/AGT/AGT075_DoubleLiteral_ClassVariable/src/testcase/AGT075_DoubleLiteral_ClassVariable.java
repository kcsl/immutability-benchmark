package testcase;

import annotations.MUTABLE;

public class AGT075_DoubleLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT075_DoubleLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT075_DoubleLiteral_ClassVariable test = new AGT075_DoubleLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT075_DoubleLiteral_ClassVariable.f = 1.0;
		System.out.println(test.toString());
	}

}
