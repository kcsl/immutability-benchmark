package testcase;

import annotations.READONLY;

public class AGT220_Parameter_ClassVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT220_Parameter_ClassVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object());
		System.out.println(test);
	}

}

class Test {
	public static Object[] f = new Object[]{ new Object() };

	public void bar(Object p){
		Test.f[0] = p;
	}
	
	@Override
	public String toString() {
		return "Test []";
	}
}