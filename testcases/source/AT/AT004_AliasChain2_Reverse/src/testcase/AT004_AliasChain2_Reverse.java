package testcase;

import annotations.MUTABLE;

public class AT004_AliasChain2_Reverse {
	@MUTABLE
	public Test test;

	public static void main(String[] args) {
		new AT004_AliasChain2_Reverse().foo();
	}

	public void foo() {
		// test -> b -> a
		Test a = new Test();
		Test b = a;
		test = b;
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