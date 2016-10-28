package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT138_ObjectInstanceVariable_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT138_ObjectInstanceVariable_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT138_ObjectInstanceVariable_ParameterArrayComponent a = new AGT138_ObjectInstanceVariable_ParameterArrayComponent();
		System.out.println(a);
		a.foo(a.f);
		System.out.println(a);
	}
	
	public void foo(Object[] p){
		AGT138_ObjectInstanceVariable_ParameterArrayComponent b = new AGT138_ObjectInstanceVariable_ParameterArrayComponent();
		p[0] = b.f;
	}

}
