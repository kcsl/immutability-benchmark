package testcase;

import annotations.READONLY;

public class AGT007_FinalObject_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT007_FinalObject_Parameter().foo();
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
		final Object o = new Object();
		p = o;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}