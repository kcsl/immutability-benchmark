package testcase;

import annotations.READONLY;

public class AGT105_NullLiteral_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT105_NullLiteral_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		Test.f = null;
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