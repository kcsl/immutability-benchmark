package testcase;

import annotations.MUTABLE;

public class AGT133_ObjectInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT133_ObjectInstanceVariable_ThisInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT133_ObjectInstanceVariable_ThisInstanceVariable a = new AGT133_ObjectInstanceVariable_ThisInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT133_ObjectInstanceVariable_ThisInstanceVariable b = new AGT133_ObjectInstanceVariable_ThisInstanceVariable();
		this.f = b.f;
	}

}
