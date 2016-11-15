package testcase;

import annotations.READONLY;

public class AGT205_DynamicDispatchReturn_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT205_DynamicDispatchReturn_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT205_DynamicDispatchReturn_ClassVariable test = new AGT205_DynamicDispatchReturn_ClassVariable();
		System.out.println(test.toString());
		AGT205_DynamicDispatchReturn_ClassVariable.f = test.bar();
		System.out.println(test.toString());
	}
	
	public Object bar(){
		return new Object();
	}

}
