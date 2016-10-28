package testcase;

import annotations.MUTABLE;

public class AGT061_FloatLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT061_FloatLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT061_FloatLiteral_ObjectInstanceVariable test = new AGT061_FloatLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = 1.0F;
		System.out.println(test);
	}

}
