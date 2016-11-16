package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT002_FinalObject_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT002_FinalObject_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		final Object o = new Object();
		System.out.println(test);
		test.f[0] = o;
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