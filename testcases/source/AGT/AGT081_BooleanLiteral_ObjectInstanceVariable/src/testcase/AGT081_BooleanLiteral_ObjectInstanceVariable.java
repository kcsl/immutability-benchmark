package testcase;

import annotations.MUTABLE;

public class AGT081_BooleanLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT081_BooleanLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT081_BooleanLiteral_ObjectInstanceVariable test = new AGT081_BooleanLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = true;
		System.out.println(test);
	}

}
