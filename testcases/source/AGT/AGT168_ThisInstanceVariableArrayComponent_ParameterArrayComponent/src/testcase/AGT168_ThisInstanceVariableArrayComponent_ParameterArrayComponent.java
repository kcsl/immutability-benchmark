package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent().foo();
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
		p[0] = this.f2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
}