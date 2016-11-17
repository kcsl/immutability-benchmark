package testcase;

import annotations.READONLY;

public class AGT006_FinalObject_ClassVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT006_FinalObject_ClassVariableArrayComponent().foo();
	}
	
	public void foo(){
		final Object o = new Object();
		System.out.println(test);
		Test.f[0] = o;
		System.out.println(test);
	}

}

class Test {
	public static Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		// updates to static fields to do not mutate a particular instance
		// instead it is considered a mutation to global program state
		return "Test []";
	}
}