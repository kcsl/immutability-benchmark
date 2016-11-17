package testcase;

import annotations.READONLY;

public class AGT097_StringLiteral_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT097_StringLiteral_Parameter().foo();
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
		p = "1";
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}