package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT008_FinalObject_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT008_FinalObject_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT008_FinalObject_ParameterArrayComponent test = new AGT008_FinalObject_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		final Object o = new Object();
		p[0] = o;
	}

}
