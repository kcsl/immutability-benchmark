package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		Test o = new Test();
		System.out.println(test);
		test.f1 = o.f2[0];
		System.out.println(test);
	}

}

class Test {
	public Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "Test [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
}