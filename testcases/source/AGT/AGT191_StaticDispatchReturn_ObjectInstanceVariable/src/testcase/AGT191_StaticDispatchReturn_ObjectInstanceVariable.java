package testcase;

import annotations.MUTABLE;

public class AGT191_StaticDispatchReturn_ObjectInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT191_StaticDispatchReturn_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT191_StaticDispatchReturn_ObjectInstanceVariable test = new AGT191_StaticDispatchReturn_ObjectInstanceVariable();
		System.out.println(test);
		test.f = bar();
		System.out.println(test);
	}
	
	public static Object bar(){
		return new Object();
	}

}
