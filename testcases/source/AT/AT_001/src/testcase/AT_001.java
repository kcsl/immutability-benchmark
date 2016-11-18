package testcase;

import annotations.MUTABLE;

public class AT_001 {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AT_001().foo();
	}
	
	public void foo(){
		Test test2 = test.getThis(); // indirect assignment of test to test2
		System.out.println(test);
		test2.f = new Object(); // test2 is test
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public Test getThis(){
		return this;
	}

	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}