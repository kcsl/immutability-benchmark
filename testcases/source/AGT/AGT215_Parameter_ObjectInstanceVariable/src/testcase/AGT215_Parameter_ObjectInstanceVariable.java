package testcase;

import annotations.READONLY;

public class AGT215_Parameter_ObjectInstanceVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT215_Parameter_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p){
		Test o = new Test();
		o.f = p;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}