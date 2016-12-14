package testcase;

import annotations.READONLY;

public class ST006_DynamicDispatches2 {
	@READONLY
	public static Test test = new A();

	public static void main(String[] args) {
		System.out.println(test);
		test.foo(); // A.foo does not mutate test
		System.out.println(test);
	}
}

class Test {
	protected Object f = new Object();

	public void foo() {} // no mutations

	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}

class A extends Test {
	@Override
	public void foo() {} // no mutations
}

class B extends Test {
	@Override
	public void foo() {
		this.f = new Object(); // mutates 'this'
	}
}