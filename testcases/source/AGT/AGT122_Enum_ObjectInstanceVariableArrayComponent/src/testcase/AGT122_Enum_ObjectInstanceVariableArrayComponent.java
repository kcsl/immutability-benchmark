package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT122_Enum_ObjectInstanceVariableArrayComponent {
	
	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT122_Enum_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f[0] = Enum.E;
		System.out.println(test);
	}

}

enum Enum {
	E;
}

class Test {
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}