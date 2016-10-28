package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT048_IntLiteral_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT048_IntLiteral_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT048_IntLiteral_ParameterArrayComponent test = new AGT048_IntLiteral_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = (int) 1;
	}

}
