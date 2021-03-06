package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT249_ParameterInstanceVariableArrayComponent_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT249_ParameterInstanceVariableArrayComponent_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Test());
		System.out.println(test);
	}

}

class Test {
	public static Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };

	public void bar(Test p){
		Test.f1 = p.f2[0];
	}

	@Override
	public String toString() {
		return "Test [f2=" + Arrays.toString(f2) + "]";
	}
}