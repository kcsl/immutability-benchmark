package testcase;

import annotations.READONLY;

public class AGT115_This_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT115_This_ClassVariable [f=IMMUTABLE]";
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
