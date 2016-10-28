package testcase;

import annotations.MUTABLE;

public class AGT203_DynamicDispatchReturn_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT203_DynamicDispatchReturn_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = this.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT203_DynamicDispatchReturn_ThisInstanceVariable test = new AGT203_DynamicDispatchReturn_ThisInstanceVariable();
		test.foo();
	}
	
	public Object bar(){
		return new Object();
	}

}
