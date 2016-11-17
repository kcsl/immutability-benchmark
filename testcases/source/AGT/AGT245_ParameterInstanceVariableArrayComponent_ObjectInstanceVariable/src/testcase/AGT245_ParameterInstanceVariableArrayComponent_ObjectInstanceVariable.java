package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Test());
		System.out.println(test);
	}

}

class Test {
	public Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };
	
	public void bar(Test p){
		Test test2 = new Test();
		test2.f1 = p.f2[0];
	}

	@Override
	public String toString() {
		return "Test [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
}