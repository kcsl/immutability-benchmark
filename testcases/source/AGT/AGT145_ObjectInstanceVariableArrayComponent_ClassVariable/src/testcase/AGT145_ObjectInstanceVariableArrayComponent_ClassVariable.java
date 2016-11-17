package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT145_ObjectInstanceVariableArrayComponent_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT145_ObjectInstanceVariableArrayComponent_ClassVariable().foo();
	}
	
	public void foo(){
		Test o = new Test();
		System.out.println(test);
		Test.f1 = o.f2[0];
		System.out.println(test);
	}

}

class Test {
	public static Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "Test [f2=" + Arrays.toString(f2) + "]";
	}
}