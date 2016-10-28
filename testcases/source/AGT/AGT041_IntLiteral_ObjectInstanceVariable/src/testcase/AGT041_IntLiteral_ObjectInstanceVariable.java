package testcase;

import annotations.MUTABLE;

public class AGT041_IntLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT041_IntLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT041_IntLiteral_ObjectInstanceVariable test = new AGT041_IntLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = (int) 1;
		System.out.println(test);
	}

}
