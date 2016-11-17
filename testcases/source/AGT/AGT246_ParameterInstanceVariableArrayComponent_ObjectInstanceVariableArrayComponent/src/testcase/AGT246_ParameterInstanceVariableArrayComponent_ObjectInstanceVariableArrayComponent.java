package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Test());
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Test p){
		Test test2 = new Test();
		test2.f[0] = p.f[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}