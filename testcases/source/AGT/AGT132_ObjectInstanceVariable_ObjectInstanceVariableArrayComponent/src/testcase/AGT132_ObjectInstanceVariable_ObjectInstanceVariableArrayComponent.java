package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		Test test2 = new Test();
		System.out.println(test);
		test.f1[0] = test2.f2;
		System.out.println(test);
	}

}

class Test {
	public Object[] f1 = new Object[]{ new Object() };
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "Test [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
}