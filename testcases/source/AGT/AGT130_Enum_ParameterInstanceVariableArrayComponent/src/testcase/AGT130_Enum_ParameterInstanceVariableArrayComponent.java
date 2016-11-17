package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT130_Enum_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT130_Enum_ParameterInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

enum Enum {
	E;
}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Test p){
		p.f[0] = Enum.E;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}