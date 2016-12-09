package testcase;

import annotations.MUTABLE;

public class AT002_AliasChain1_Reverse {
	@MUTABLE
	public Test test;

	public static void main(String[] args) {
		new AT002_AliasChain1_Reverse().foo();
	}

	public void foo() {
		// test -> a
		Test a = new Test();
		test = a;
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