package testcase;

import annotations.MUTABLE;

public class AGT201_DynamicDispatchReturn_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public Object bar(){
		return new Object();
	}
	
	public static void main(String[] args) {
		new AGT201_DynamicDispatchReturn_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = this.bar();
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