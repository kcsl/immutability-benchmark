package testcase;

import annotations.READONLY;

public class AGT157_ThisInstanceVariable_Parameter {

	@READONLY
	public Object f1 = new Object();

	@Override
	public String toString() {
		return "AGT157_ThisInstanceVariable_Parameter [f1=" + f1 + "]";
	}
	
	public static void main(String[] args) {
		AGT157_ThisInstanceVariable_Parameter a = new AGT157_ThisInstanceVariable_Parameter ();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(Object p){
		p = this.f1;
	}

}
