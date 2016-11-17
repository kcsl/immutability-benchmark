package testcase;

import annotations.READONLY;

public class AGT137_ObjectInstanceVariable_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT137_ObjectInstanceVariable_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p){
		Test o = new Test();
		p = o.f;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}