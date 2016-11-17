package testcase;

import annotations.MUTABLE;

public class AGT233_ParameterInstanceVariable_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT233_ParameterInstanceVariable_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test, new Test());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Test p1, Test p2){
		p1.f = p2.f;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}