package testcase;

import annotations.READONLY;

public class AGT137_ObjectInstanceVariable_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT137_ObjectInstanceVariable_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT137_ObjectInstanceVariable_Parameter a = new AGT137_ObjectInstanceVariable_Parameter();
		System.out.println(a);
		a.foo(a.f);
		System.out.println(a);
	}
	
	public void foo(Object p){
		AGT137_ObjectInstanceVariable_Parameter b = new AGT137_ObjectInstanceVariable_Parameter();
		p = b.f;
	}

}
