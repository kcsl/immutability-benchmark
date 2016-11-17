package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent().foo();
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
		this.f[0] = p.f[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}