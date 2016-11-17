package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		Test o = new Test();
		System.out.println(test);
		test.f[0] = o.f[0];
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}