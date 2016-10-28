package testcase;

import annotations.MUTABLE;

public class AGT055_LongLiteral_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT055_LongLiteral_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT055_LongLiteral_ClassVariable test = new AGT055_LongLiteral_ClassVariable();
		System.out.println(test.toString());
		AGT055_LongLiteral_ClassVariable.f = 1L;
		System.out.println(test.toString());
	}

}
