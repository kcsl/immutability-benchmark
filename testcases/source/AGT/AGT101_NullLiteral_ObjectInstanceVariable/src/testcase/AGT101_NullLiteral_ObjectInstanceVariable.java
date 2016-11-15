package testcase;

import annotations.MUTABLE;

public class AGT101_NullLiteral_ObjectInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT101_NullLiteral_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = null;
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT101_NullLiteral_ObjectInstanceVariable [f=" + f + "]";
	}
}
