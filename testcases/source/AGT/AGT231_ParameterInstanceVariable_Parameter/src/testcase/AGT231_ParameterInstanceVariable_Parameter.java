package testcase;

import annotations.READONLY;

public class AGT231_ParameterInstanceVariable_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT231_ParameterInstanceVariable_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f, new Test());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p1, Test p2){
		p1 = p2.f;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}