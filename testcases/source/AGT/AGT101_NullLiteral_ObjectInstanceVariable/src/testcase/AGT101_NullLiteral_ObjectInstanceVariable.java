package testcase;

import annotations.MUTABLE;

public class AGT101_NullLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT101_NullLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT101_NullLiteral_ObjectInstanceVariable test = new AGT101_NullLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = null;
		System.out.println(test);
	}

}
