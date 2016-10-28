package testcase;

import annotations.MUTABLE;

public class AGT071_DoubleLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT071_DoubleLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT071_DoubleLiteral_ObjectInstanceVariable test = new AGT071_DoubleLiteral_ObjectInstanceVariable();
		System.out.println(test);
		test.f = 1.0;
		System.out.println(test);
	}

}
