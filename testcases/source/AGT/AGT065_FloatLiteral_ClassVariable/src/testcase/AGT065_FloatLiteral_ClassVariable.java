package testcase;

import annotations.READONLY;

public class AGT065_FloatLiteral_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT065_FloatLiteral_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT065_FloatLiteral_ClassVariable test = new AGT065_FloatLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT065_FloatLiteral_ClassVariable.f = 1.0F;
		System.out.println(test.toString());
	}

}
