package testcase;

import annotations.READONLY;

public class AGT187_ClassVariableArrayComponent_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT187_ClassVariableArrayComponent_Parameter().foo();
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
	
	public void bar(Object p){
		p = Test.f2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + f1 + "]";
	}
}