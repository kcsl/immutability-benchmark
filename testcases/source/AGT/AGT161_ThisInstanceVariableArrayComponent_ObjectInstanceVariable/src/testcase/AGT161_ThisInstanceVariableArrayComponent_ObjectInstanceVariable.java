package testcase;

import annotations.MUTABLE;

public class AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public Object[] f = new Object[]{ new Object() };
	
	public static void main(String[] args) {
		new AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = this.f[0];
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