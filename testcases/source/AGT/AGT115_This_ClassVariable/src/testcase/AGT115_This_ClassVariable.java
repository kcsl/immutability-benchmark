package testcase;

import annotations.MUTABLE;

public class AGT115_This_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		// using hashcode to avoid a recursive stack overflow
		return "AGT115_This_ClassVariable [f=" + f.hashCode() + "]";
	}
	
	public static void main(String[] args) {
		AGT115_This_ClassVariable a = new AGT115_This_ClassVariable();
		a.foo();
	}

	public void foo(){
		AGT115_This_ClassVariable b = new AGT115_This_ClassVariable();
		System.out.println(b.toString());
		AGT115_This_ClassVariable.f = this;
		System.out.println(b.toString());
	}
	
}
