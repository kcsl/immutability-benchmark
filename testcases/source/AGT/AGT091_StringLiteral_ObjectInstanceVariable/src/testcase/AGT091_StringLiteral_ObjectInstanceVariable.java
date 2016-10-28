package testcase;

import annotations.MUTABLE;

public class AGT091_StringLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT091_StringLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT091_StringLiteral_ObjectInstanceVariable test = new AGT091_StringLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = "1";
		System.out.println(test);
	}

}
