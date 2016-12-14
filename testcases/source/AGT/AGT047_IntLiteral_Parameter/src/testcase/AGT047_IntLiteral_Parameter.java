package testcase;

import annotations.READONLY;

public class AGT047_IntLiteral_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT047_IntLiteral_Parameter().foo();
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
		p = (int) 1;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}