package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT192_StaticDispatchReturn_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static Object bar(){
		return new Object();
	}
	
	public static void main(String[] args) {
		new AGT192_StaticDispatchReturn_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f[0] = AGT192_StaticDispatchReturn_ObjectInstanceVariableArrayComponent.bar();
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