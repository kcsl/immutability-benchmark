package testcase;

import annotations.MUTABLE;

public class AGT065_FloatLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT065_FloatLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT065_FloatLiteral_ClassVariable test = new AGT065_FloatLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT065_FloatLiteral_ClassVariable.f = 1.0F;
		System.out.println(test.toString());
	}

}
