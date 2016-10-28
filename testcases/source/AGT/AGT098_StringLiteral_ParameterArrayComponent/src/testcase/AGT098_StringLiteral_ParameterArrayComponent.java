package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT098_StringLiteral_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT098_StringLiteral_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT098_StringLiteral_ParameterArrayComponent test = new AGT098_StringLiteral_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = "1";
	}

}
