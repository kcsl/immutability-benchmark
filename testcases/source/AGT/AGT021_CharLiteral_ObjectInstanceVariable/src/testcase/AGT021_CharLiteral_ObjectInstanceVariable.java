package testcase;

import annotations.MUTABLE;

public class AGT021_CharLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT021_CharLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT021_CharLiteral_ObjectInstanceVariable test = new AGT021_CharLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = '1';
		System.out.println(test);
	}

}
