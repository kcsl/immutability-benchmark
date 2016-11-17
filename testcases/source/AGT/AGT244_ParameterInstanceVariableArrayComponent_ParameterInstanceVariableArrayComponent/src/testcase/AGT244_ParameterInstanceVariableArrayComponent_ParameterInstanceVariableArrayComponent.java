package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test, new Test());
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Test p1, Test p2){
		p1.f[0] = p2.f[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}