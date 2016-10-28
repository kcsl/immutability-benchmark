package testcase;

import annotations.READONLY;

public class AGT177_ClassVariable_Parameter {

	@READONLY
	public static Object f1 = new Object();

	@Override
	public String toString() {
		return "AGT157_ThisInstanceVariable_Parameter [f1=" + f1 + "]";
	}
	
	public static void main(String[] args) {
		AGT177_ClassVariable_Parameter a = new AGT177_ClassVariable_Parameter ();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(Object p){
		p = AGT177_ClassVariable_Parameter.f1;
	}

}
