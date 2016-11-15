package testcase;

import annotations.READONLY;

public class AGT175_ClassVariable_ClassVariable {

	@READONLY
	public static Object f1 = new Object();
	
	@READONLY
	public static Object f2 = new Object();

	@Override
	public String toString() {
		assert(f1 instanceof Object); // Object types are immutable
		return "AGT175_ClassVariable_ClassVariable [f1=IMMUTABLE" + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT175_ClassVariable_ClassVariable test = new AGT175_ClassVariable_ClassVariable();
		System.out.println(test);
		AGT175_ClassVariable_ClassVariable.f1 = AGT175_ClassVariable_ClassVariable.f2;
		System.out.println(test);
	}

}
