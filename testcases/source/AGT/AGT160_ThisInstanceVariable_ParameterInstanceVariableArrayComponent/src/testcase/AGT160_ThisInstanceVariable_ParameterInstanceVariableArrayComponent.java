package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object[] f1 = new Object[]{ new Object() };
	public Object f2 = new Object();
	
	public void bar(Test p){
		p.f1[0] = this.f2;
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
}