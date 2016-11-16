package testcase;

import annotations.MUTABLE;

public class AGT121_Enum_ObjectInstanceVariable {
	
	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT121_Enum_ObjectInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = Enum.E;
		System.out.println(test);
	}

}

enum Enum {
	E;
}

class Test {
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}