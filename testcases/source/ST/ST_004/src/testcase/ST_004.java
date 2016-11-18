package testcase;

import annotations.MUTABLE;

public class ST_004 {

	public Test o = new Test();
	
	@MUTABLE
	public Test test;
	
	public static void main(String[] args) {
		new ST_004().foo();
	}
	
	public void foo(){
		// b -> test -> a -> o
		Test a = o;
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