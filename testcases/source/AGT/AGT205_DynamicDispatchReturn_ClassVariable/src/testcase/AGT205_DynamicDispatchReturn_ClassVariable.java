package testcase;

import annotations.MUTABLE;

public class AGT205_DynamicDispatchReturn_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT205_DynamicDispatchReturn_ClassVariable [f=" + f + "]";
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
