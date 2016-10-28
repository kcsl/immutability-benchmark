package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT173_ClassVariable_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT173_ClassVariable_ThisInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT173_ClassVariable_ThisInstanceVariable a = new AGT173_ClassVariable_ThisInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1 = AGT173_ClassVariable_ThisInstanceVariable.f2;
	}

}
