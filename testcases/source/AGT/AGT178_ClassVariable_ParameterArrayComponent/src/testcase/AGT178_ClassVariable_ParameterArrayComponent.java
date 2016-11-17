package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT178_ClassVariable_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT178_ClassVariable_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f1);
		System.out.println(test);
	}

}

class Test {
	public Object[] f1 = new Object[]{ new Object() };
	public static Object f2 = new Object();
	
	public void bar(Object[] p){
		p[0] = Test.f2;
	}
	
	@Override
	public String toString() {
		return "Test [f1=" + Arrays.toString(f1) + "]";
	}
}