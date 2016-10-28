package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT153_ThisInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT153_ThisInstanceVariable_ThisInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT153_ThisInstanceVariable_ThisInstanceVariable a = new AGT153_ThisInstanceVariable_ThisInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1 = this.f2;
	}

}
