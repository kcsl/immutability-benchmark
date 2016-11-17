package testcase;

import annotations.READONLY;

public class AGT197_StaticDispatchReturn_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT197_StaticDispatchReturn_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();

	public void bar(Object p){
		p = Test.baz();
	}
	
	public static Object baz(){
		return new Object();
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}