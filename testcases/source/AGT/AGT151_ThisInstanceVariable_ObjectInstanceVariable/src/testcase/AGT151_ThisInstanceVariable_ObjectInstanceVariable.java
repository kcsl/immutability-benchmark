package testcase;

import annotations.READONLY;

public class AGT151_ThisInstanceVariable_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();

	@Override
	public String toString() {
		return "AGT151_ThisInstanceVariable_ObjectInstanceVariable [f1=" + f1 + "]";
	}
	
	public static void main(String[] args) {
		AGT151_ThisInstanceVariable_ObjectInstanceVariable a = new AGT151_ThisInstanceVariable_ObjectInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT151_ThisInstanceVariable_ObjectInstanceVariable b = new AGT151_ThisInstanceVariable_ObjectInstanceVariable();
		b.f1 = this.f1;
	}

}
