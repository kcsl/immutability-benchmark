package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT155_ThisInstanceVariable_ClassVariable {

	@MUTABLE
	public static Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT155_ThisInstanceVariable_ClassVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT155_ThisInstanceVariable_ClassVariable a = new AGT155_ThisInstanceVariable_ClassVariable ();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT155_ThisInstanceVariable_ClassVariable.f1 = this.f2;
	}

}
