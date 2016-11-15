package testcase;

import annotations.READONLY;

public class AGT005_FinalObject_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT005_FinalObject_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT005_FinalObject_ClassVariable test = new AGT005_FinalObject_ClassVariable();
		final Object o = new Object();
		System.out.println(test.toString());
		AGT005_FinalObject_ClassVariable.f = o;
		System.out.println(test.toString());
	}

}
