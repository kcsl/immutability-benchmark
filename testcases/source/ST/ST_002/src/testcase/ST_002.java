package testcase;

import annotations.MUTABLE;

public class ST_002 {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new ST_002().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f = test.getThis();
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public Test getThis(){
		return this;
	}

	@Override
	public String toString() {
		return "Test [f=" + f.hashCode() + "]";
	}
}