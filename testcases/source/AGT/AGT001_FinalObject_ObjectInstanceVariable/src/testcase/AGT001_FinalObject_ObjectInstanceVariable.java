package testcase;

import annotations.MUTABLE;

public class AGT001_FinalObject_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT001_FinalObject_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		final Object o = new Object();
		System.out.println(test);
		test.f = o;
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