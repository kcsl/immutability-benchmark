package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public enum AGT128_Enum_ParameterArrayComponent {

	A,B;
	
	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT128_Enum_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT128_Enum_ParameterArrayComponent test = AGT128_Enum_ParameterArrayComponent.A;
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = AGT128_Enum_ParameterArrayComponent.B;
	}

}
