package testcase;

import annotations.MUTABLE;

public class AGT217_Parameter_ThisInstanceVariable {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT217_Parameter_ThisInstanceVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object());
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p){
		this.f = p;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}