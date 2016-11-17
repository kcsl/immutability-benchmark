package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT208_DynamicDispatchReturn_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT208_DynamicDispatchReturn_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };

	public void bar(Object[] p){
		p[0] = this.baz();
	}
	
	public Object baz(){
		return new Object();
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}