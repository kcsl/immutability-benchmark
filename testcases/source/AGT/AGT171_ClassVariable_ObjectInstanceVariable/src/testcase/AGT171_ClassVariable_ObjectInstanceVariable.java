package testcase;

import annotations.READONLY;

public class AGT171_ClassVariable_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT171_ClassVariable_ObjectInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT171_ClassVariable_ObjectInstanceVariable a = new AGT171_ClassVariable_ObjectInstanceVariable();
		System.out.println(a);
		a.f1 = AGT171_ClassVariable_ObjectInstanceVariable.f2;
		System.out.println(a);
	}

}
