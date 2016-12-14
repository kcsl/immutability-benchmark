package testcase;

import annotations.READONLY;

public class ST004_MultipleArrayComponents2 {

	@READONLY
	public Test test = new Test();
	
	public Test[] tests = new Test[]{ test, new Test() };

	public static void main(String[] args) {
		new ST004_MultipleArrayComponents2().foo();
	}
	
	public void foo(){
		System.out.println(test);
		tests[1].f = new Object();
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