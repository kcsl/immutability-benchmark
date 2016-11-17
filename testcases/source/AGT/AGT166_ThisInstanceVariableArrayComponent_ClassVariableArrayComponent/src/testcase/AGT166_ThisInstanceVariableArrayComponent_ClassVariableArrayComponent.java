package testcase;

import annotations.READONLY;

public class AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public Object[] f = new Object[]{ new Object() };
	
	public static void main(String[] args) {
		new AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		Test.f[0] = this.f[0];
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