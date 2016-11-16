package testcase;

import annotations.MUTABLE;

public class AGT171_ClassVariable_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static Object f = new Object();
	
	public static void main(String[] args) {
		new AGT171_ClassVariable_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = AGT171_ClassVariable_ObjectInstanceVariable.f;
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