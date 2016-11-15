package testcase;

import annotations.READONLY;

public class AGT045_IntLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT045_IntLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT045_IntLiteral_ClassVariable test = new AGT045_IntLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT045_IntLiteral_ClassVariable.f = (int) 1;
		System.out.println(test.toString());
	}

}
