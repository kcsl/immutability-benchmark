package testcase;

import annotations.MUTABLE;

public class AT_003 {

	@MUTABLE
	public Test test;
	
	public static void main(String[] args) {
		new AT_003().foo();
	}
	
	public void foo(){
		// b -> test -> a
		Test a = new Test();
		test = a;
		Test b = test;
		
		System.out.println(test);
		a.f = new Object(); // a mutation to a is a mutation to test
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "Test [f=" + f.toString() + "]";
	}
}