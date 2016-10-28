package testcase;

import annotations.MUTABLE;

public class AGT045_IntLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT045_IntLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT045_IntLiteral_ClassVariable test = new AGT045_IntLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT045_IntLiteral_ClassVariable.f = (int) 1;
		System.out.println(test.toString());
	}

}
