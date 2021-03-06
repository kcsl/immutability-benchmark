package testcase;

import annotations.READONLY;

public class AGT045_IntLiteral_ClassVariable {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT045_IntLiteral_ClassVariable().foo();
	}
	
	public void foo(){
		System.out.println(test);
		Test.f = (int) 1;
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