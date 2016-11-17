package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT241_ParameterInstanceVariableArrayComponent_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT241_ParameterInstanceVariableArrayComponent_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f, new Test());
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object p1, Test p2){
		p1 = p2.f[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}