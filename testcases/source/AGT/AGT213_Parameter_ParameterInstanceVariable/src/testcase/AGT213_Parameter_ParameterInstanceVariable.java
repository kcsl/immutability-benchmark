package testcase;

import annotations.MUTABLE;

public class AGT213_Parameter_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT213_Parameter_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test, new Object());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Test p1, Object p2){
		p1.f = p2;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}