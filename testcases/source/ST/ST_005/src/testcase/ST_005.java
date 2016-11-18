package testcase;

import annotations.MUTABLE;

public class ST_005 {

	public Test o = new Test();
	
	@MUTABLE
	public Test test;
	
	public static void main(String[] args) {
		new ST_005().foo();
	}
	
	public void foo(){
		// b -> test -> a -> o
		Test a = o;
		Test test = a;
		Test b = test;
		
		System.out.println(test);
		b.f = new Object();
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