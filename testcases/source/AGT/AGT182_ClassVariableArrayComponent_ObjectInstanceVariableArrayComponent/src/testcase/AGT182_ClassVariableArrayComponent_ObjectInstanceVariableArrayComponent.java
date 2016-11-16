package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static Object[] f = new Object[]{ new Object() };
	
	public static void main(String[] args) {
		new AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f[0] = AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent.f[0];
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