package testcase;

import annotations.MUTABLE;

public class AGT193_StaticDispatchReturn_ThisInstanceVariable {

	@MUTABLE
	public static AGT193_StaticDispatchReturn_ThisInstanceVariable test = new AGT193_StaticDispatchReturn_ThisInstanceVariable();
	
	public Object f1 = new Object();

	@Override
	public String toString() {
		return "AGT193_StaticDispatchReturn_ThisInstanceVariable [f1=" + f1 + "]";
	}

	public static Object bar(){
		return new Object();
	}
	
	public void foo(){
		System.out.println(this.toString());
		this.f1 = AGT193_StaticDispatchReturn_ThisInstanceVariable.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}