package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT135_ObjectInstanceVariable_ClassVariable {
	
	@MUTABLE
	public static Object f1 = new Object();

	@READONLY
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT135_ObjectInstanceVariable_ClassVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT135_ObjectInstanceVariable_ClassVariable test = new AGT135_ObjectInstanceVariable_ClassVariable();
		System.out.println(test.toString());
		AGT135_ObjectInstanceVariable_ClassVariable.f1 = test.f2;
		System.out.println(test.toString());
	}

}
