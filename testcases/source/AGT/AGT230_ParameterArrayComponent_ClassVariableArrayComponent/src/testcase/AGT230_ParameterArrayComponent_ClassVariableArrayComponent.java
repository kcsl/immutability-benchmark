package testcase;

import annotations.READONLY;

public class AGT230_ParameterArrayComponent_ClassVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT230_ParameterArrayComponent_ClassVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object[]{ new Object() });
		System.out.println(test);
	}

}

class Test {
	public static Object[] f = new Object[]{ new Object() };

	public void bar(Object[] p){
		Test.f[0] = p[0];
	}
	
	@Override
	public String toString() {
		return "Test []";
	}
}