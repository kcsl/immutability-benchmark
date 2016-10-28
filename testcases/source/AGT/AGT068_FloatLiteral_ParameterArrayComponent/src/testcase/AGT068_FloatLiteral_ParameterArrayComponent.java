package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT068_FloatLiteral_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT068_FloatLiteral_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT068_FloatLiteral_ParameterArrayComponent test = new AGT068_FloatLiteral_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = 1.0F;
	}

}
