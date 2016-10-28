package testcase;

import annotations.READONLY;

public class AGT215_Parameter_ObjectInstanceVariable {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT215_Parameter_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public void foo(Object p){
		AGT215_Parameter_ObjectInstanceVariable b = new AGT215_Parameter_ObjectInstanceVariable();
		b.f = p;
	}
	
	public static void main(String[] args) {
		AGT215_Parameter_ObjectInstanceVariable a = new AGT215_Parameter_ObjectInstanceVariable();
		System.out.println(a);
		a.foo(a.f);
		System.out.println(a);
	}

}
