package testcase;

import annotations.READONLY;

public class AGT136_ObjectInstanceVariable_ClassVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT136_ObjectInstanceVariable_ClassVariableArrayComponent().foo();
	}
	
	public void foo(){
		Test o = new Test();
		System.out.println(test);
		Test.f1[0] = o.f2;
		System.out.println(test);
	}

}

class Test {
	public static Object[] f1 = new Object[]{ new Object() };
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "Test [f2=" + f2 + "]";
	}
}