package testcase;

import annotations.MUTABLE;

public class AGT051_LongLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT051_LongLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT051_LongLiteral_ObjectInstanceVariable test = new AGT051_LongLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = 1L;
		System.out.println(test);
	}

}
