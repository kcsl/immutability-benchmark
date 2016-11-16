package testcase;

import annotations.MUTABLE;

public class AGT153_ThisInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public static AGT153_ThisInstanceVariable_ThisInstanceVariable test = new AGT153_ThisInstanceVariable_ThisInstanceVariable();
	
	public Object f1 = new Object();
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT153_ThisInstanceVariable_ThisInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1 = this.f2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}