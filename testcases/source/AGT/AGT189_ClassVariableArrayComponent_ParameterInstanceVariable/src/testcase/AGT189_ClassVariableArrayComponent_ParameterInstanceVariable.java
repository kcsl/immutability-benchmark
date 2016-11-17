package testcase;

import annotations.MUTABLE;

public class AGT189_ClassVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT189_ClassVariableArrayComponent_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f1 = new Object();
	public static Object[] f2 = new Object[]{ new Object() };
	
	public void bar(Test p){
		p.f1 = Test.f2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + f1 + "]";
	}
}