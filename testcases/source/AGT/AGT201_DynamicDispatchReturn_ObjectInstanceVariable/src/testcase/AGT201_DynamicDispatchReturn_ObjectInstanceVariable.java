package testcase;

import annotations.MUTABLE;

public class AGT201_DynamicDispatchReturn_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT201_DynamicDispatchReturn_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT201_DynamicDispatchReturn_ObjectInstanceVariable test = new AGT201_DynamicDispatchReturn_ObjectInstanceVariable();
		System.out.println(test);
		test.f = test.bar();
		System.out.println(test);
	}
	
	public Object bar(){
		return new Object();
	}

}
