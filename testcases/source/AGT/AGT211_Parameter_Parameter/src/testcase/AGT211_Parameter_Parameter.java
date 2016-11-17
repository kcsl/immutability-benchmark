package testcase;

import annotations.READONLY;

public class AGT211_Parameter_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT211_Parameter_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f, new Object());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p1, Object p2){
		p1 = p2;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}