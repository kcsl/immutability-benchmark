package testcase;

import annotations.MUTABLE;

public class AT003_AliasChain2_Forward {
	@MUTABLE
	public Test test = new Test();

	public static void main(String[] args) {
		new AT003_AliasChain2_Forward().foo();
	}

	public void foo() {
		// a -> b -> test
		Test b = test;
		Test a = b;
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

