package testcase;

import annotations.READONLY;

public class AGT005_FinalObject_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT005_FinalObject_ClassVariable().foo();
	}
	
	public void foo(){
		final Object o = new Object();
		System.out.println(test);
		Test.f = o;
		System.out.println(test);
	}

}

class Test {
	public static Object f = new Object();

	@Override
	public String toString() {
		// updates to static fields to do not mutate a particular instance
		// instead it is considered a mutation to global program state
		return "Test []";
	}
}