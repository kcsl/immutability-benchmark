package testcase;

import annotations.MUTABLE;

public class AGT005_FinalObject_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT005_FinalObject_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT005_FinalObject_ClassVariable test = new AGT005_FinalObject_ClassVariable();
		final Object o = new Object();
		System.out.println(test.toString());
		AGT005_FinalObject_ClassVariable.f = o;
		System.out.println(test.toString());
	}

}
