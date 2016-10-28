package testcase;

import annotations.MUTABLE;

public class AGT001_FinalObject_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT001_FinalObject_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT001_FinalObject_ObjectInstanceVariable test = new AGT001_FinalObject_ObjectInstanceVariable();
		final Object o = new Object();
		System.out.println(test);
		test.f = o;
		System.out.println(test);
	}

}
