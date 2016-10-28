package testcase;

import annotations.MUTABLE;

public class AGT025_CharLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT025_CharLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT025_CharLiteral_ClassVariable test = new AGT025_CharLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT025_CharLiteral_ClassVariable.f = '1';
		System.out.println(test.toString());
	}

}
