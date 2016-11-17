package testcase;

import annotations.MUTABLE;

public class AGT133_ObjectInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public static AGT133_ObjectInstanceVariable_ThisInstanceVariable test = new AGT133_ObjectInstanceVariable_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT133_ObjectInstanceVariable_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		AGT133_ObjectInstanceVariable_ThisInstanceVariable o = new AGT133_ObjectInstanceVariable_ThisInstanceVariable();
		System.out.println(this.toString());
		this.f = o.f;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}