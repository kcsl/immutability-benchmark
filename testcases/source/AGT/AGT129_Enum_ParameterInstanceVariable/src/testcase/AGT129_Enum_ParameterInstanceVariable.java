package testcase;

import annotations.MUTABLE;

public class AGT129_Enum_ParameterInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT129_Enum_ParameterInstanceVariable().foo();
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
	
	public void bar(Test p){
		p.f = Enum.E;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}