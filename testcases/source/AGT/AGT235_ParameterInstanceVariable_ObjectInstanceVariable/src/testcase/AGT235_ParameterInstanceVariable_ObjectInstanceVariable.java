package testcase;

import annotations.READONLY;

public class AGT235_ParameterInstanceVariable_ObjectInstanceVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT235_ParameterInstanceVariable_ObjectInstanceVariable().foo();
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
		Test o = new Test();
		o.f = p.f;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}