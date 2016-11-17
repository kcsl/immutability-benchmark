package testcase;

import annotations.READONLY;

public class AGT239_ParameterInstanceVariable_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT239_ParameterInstanceVariable_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Test());
		System.out.println(test);
	}

}

class Test {
	public static Object f1 = new Object();
	public Object f2 = new Object();
	
	public void bar(Test p){
		Test.f1 = p.f2;
	}
	
	@Override
	public String toString() {
		return "Test [f2=" + f2 + "]";
	}
}