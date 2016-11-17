package testcase;

import annotations.MUTABLE;

public class AGT237_ParameterInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT237_ParameterInstanceVariable_ThisInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Test());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Test p){
		this.f = p.f;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}