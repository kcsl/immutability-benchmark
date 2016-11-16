package testcase;

import annotations.MUTABLE;

public class AGT193_StaticDispatchReturn_ThisInstanceVariable {

	@MUTABLE
	public static AGT193_StaticDispatchReturn_ThisInstanceVariable test = new AGT193_StaticDispatchReturn_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT193_StaticDispatchReturn_ThisInstanceVariable [f=" + f + "]";
	}

	public static Object bar(){
		return new Object();
	}
	
	public void foo(){
		System.out.println(this.toString());
		this.f = AGT193_StaticDispatchReturn_ThisInstanceVariable.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}