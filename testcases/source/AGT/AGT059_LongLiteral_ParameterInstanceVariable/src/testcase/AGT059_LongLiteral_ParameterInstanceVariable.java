package testcase;

import annotations.MUTABLE;

public class AGT059_LongLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT059_LongLiteral_ParameterInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Test p){
		p.f = 1L;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}