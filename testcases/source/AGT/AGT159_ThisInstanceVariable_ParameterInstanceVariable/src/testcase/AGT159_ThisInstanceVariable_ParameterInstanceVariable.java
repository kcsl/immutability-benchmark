package testcase;

import annotations.MUTABLE;

public class AGT159_ThisInstanceVariable_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT159_ThisInstanceVariable_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}
}

class Test {
	public Object f1 = new Object();
	public Object f2 = new Object();

	public void bar(Test p){
		p.f1 = this.f2;
	}

	@Override
	public String toString() {
		return "Test [f1=" + f1 + ", f2=" + f2 + "]";
	}
}