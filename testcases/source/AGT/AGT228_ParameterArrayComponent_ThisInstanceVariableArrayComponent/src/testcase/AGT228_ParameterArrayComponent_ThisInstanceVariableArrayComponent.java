package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object[]{ new Object() });
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object[] p){
		this.f[0] = p[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}