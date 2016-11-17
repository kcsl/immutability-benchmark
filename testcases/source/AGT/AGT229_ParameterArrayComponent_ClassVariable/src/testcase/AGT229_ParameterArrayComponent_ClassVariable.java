package testcase;

import annotations.READONLY;

public class AGT229_ParameterArrayComponent_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT229_ParameterArrayComponent_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object[]{ new Object() });
		System.out.println(test);
	}

}

class Test {
	public static Object f = new Object();

	public void bar(Object[] p){
		Test.f = p[0];
	}
	
	@Override
	public String toString() {
		return "Test []";
	}
}