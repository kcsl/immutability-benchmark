package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f1);
		System.out.println(test);
	}

}

class Test {
	public Object[] f1 = new Object[]{ new Object() };
	public Object[] f2 = new Object[]{ new Object() };
	
	public void bar(Object[] p){
		Test test2 = new Test();
		p[0] = test2.f2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
}