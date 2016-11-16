package testcase;

import annotations.MUTABLE;

public class AGT203_DynamicDispatchReturn_ThisInstanceVariable {

	@MUTABLE
	public static AGT203_DynamicDispatchReturn_ThisInstanceVariable test = new AGT203_DynamicDispatchReturn_ThisInstanceVariable();
	
	public Object f1 = new Object();

	@Override
	public String toString() {
		return "AGT203_DynamicDispatchReturn_ThisInstanceVariable [f1=" + f1 + "]";
	}

	public Object bar(){
		return new Object();
	}
	
	public void foo(){
		System.out.println(this.toString());
		this.f1 = this.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}