package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT198_Return_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT198_Return_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT198_Return_ParameterArrayComponent test = new AGT198_Return_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = bar();
	}
	
	public static Object bar(){
		return new Object();
	}

}
