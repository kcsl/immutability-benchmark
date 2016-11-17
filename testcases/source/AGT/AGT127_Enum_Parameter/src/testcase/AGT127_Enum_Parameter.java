package testcase;

import annotations.READONLY;

public class AGT127_Enum_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT127_Enum_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

enum Enum {
	E;
}

class Test {
	public Object f = new Object();
	
	public void bar(Object p){
		p = Enum.E;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}