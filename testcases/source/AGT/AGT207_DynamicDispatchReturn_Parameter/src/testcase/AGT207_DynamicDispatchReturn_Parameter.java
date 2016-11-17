package testcase;

import annotations.READONLY;

public class AGT207_DynamicDispatchReturn_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT207_DynamicDispatchReturn_Parameter().foo();
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
		p = this.baz();
	}
	
	public Object baz(){
		return new Object();
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}