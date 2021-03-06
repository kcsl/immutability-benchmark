package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}
}

class Test {
	public Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };
	
	public void bar(Test p){
		Test o = new Test();
		p.f1 = o.f2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
}