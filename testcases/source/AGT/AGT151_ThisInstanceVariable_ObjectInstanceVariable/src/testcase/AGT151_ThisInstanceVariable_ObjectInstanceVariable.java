package testcase;

import annotations.MUTABLE;

public class AGT151_ThisInstanceVariable_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public Object f = new Object();
	
	public static void main(String[] args) {
		new AGT151_ThisInstanceVariable_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = this.f;
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