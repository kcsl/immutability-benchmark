package testcase;

import annotations.READONLY;

public class AGT111_This_ObjectInstanceVariable {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT111_This_ObjectInstanceVariable [f=" + f + "]"; 
	}
	
	public static void main(String[] args) {
		AGT111_This_ObjectInstanceVariable a = new AGT111_This_ObjectInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT111_This_ObjectInstanceVariable b = new AGT111_This_ObjectInstanceVariable();
		b.f = this;
	}

}
