package testcase;

import annotations.MUTABLE;

public class AGT131_ObjectInstanceVariable_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT131_ObjectInstanceVariable_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		Test test2 = new Test();
		System.out.println(test);
		test.f = test2.f;
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