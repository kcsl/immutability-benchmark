package testcase;

import annotations.MUTABLE;

public class ST_003 {

	public Test o = new Test();
	
	@MUTABLE
	public Test test = o;
	
	public static void main(String[] args) {
		new ST_003().foo();
	}
	
	public void foo(){
		System.out.println(test);
		o.f = new Object();
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "Test [f=" + f.toString() + "]";
	}
}