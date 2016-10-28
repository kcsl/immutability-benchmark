package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT038_ShortLiteral_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT038_ShortLiteral_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT038_ShortLiteral_ParameterArrayComponent test = new AGT038_ShortLiteral_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = (short) 1;
	}

}
