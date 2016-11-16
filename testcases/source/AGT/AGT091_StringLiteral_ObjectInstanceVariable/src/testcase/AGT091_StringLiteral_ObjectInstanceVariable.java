package testcase;

import annotations.MUTABLE;

public class AGT091_StringLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT091_StringLiteral_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = "1";
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}