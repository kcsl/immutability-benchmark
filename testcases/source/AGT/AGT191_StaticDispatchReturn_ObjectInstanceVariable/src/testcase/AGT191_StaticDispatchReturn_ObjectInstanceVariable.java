package testcase;

import annotations.MUTABLE;

public class AGT191_StaticDispatchReturn_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static Object bar(){
		return new Object();
	}
	
	public static void main(String[] args) {
		new AGT191_StaticDispatchReturn_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = AGT191_StaticDispatchReturn_ObjectInstanceVariable.bar();
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();

	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}