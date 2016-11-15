package testcase;

import annotations.READONLY;

public class AGT195_StaticDispatchReturn_ClassVariable {

	@READONLY
	public static Object f = new Object();
	
	@Override
	public String toString() {
		assert(f instanceof Object); // Object types are immutable
		return "AGT195_StaticDispatchReturn_ClassVariable [f=IMMUTABLE]";
	}
	
	public static void main(String[] args) {
		AGT195_StaticDispatchReturn_ClassVariable test = new AGT195_StaticDispatchReturn_ClassVariable();
		System.out.println(test.toString());
		AGT195_StaticDispatchReturn_ClassVariable.f = bar();
		System.out.println(test.toString());
	}
	
	public static Object bar(){
		return new Object();
	}

}
