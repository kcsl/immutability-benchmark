package testcase;

import annotations.MUTABLE;

public class AGT173_ClassVariable_ThisInstanceVariable {

	@MUTABLE
	public static AGT173_ClassVariable_ThisInstanceVariable test = new AGT173_ClassVariable_ThisInstanceVariable();
	
	public Object f1 = new Object();
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT173_ClassVariable_ThisInstanceVariable [f1=" + f1 + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1 = AGT173_ClassVariable_ThisInstanceVariable.f2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}