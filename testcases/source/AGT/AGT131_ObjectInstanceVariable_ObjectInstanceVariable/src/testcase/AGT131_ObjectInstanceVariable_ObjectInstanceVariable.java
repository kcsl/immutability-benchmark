package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT131_ObjectInstanceVariable_ObjectInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();

	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT131_ObjectInstanceVariable_ObjectInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT131_ObjectInstanceVariable_ObjectInstanceVariable a = new AGT131_ObjectInstanceVariable_ObjectInstanceVariable();
		AGT131_ObjectInstanceVariable_ObjectInstanceVariable b = new AGT131_ObjectInstanceVariable_ObjectInstanceVariable();
		System.out.println(a);
		a.f1 = b.f2;
		System.out.println(a);
	}

}
