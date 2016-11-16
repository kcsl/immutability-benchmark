package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public Object bar(){
		return new Object();
	}
	
	public static void main(String[] args) {
		new AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f[0] = this.bar();
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