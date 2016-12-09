package testcase;

import annotations.MUTABLE;

public class AT001_AliasChain1_Forward {
	 @MUTABLE
	public Test test = new Test();

	public static void main(String[] args) {
		new AT001_AliasChain1_Forward().foo();
	}

	public void foo() {
		// a -> test
		Test a = test;
		System.out.println(test);
		a.f = new Object(); // test is mutated
		System.out.println(test);
	}
	
	class Test {
		public Object f = new Object();

		@Override
		public String toString() {
			return "Test [f=" + f.toString() + "]";
		}
	}
}

