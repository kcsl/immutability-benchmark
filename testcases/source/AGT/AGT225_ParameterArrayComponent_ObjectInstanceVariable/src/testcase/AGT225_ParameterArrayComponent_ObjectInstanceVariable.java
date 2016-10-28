package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT225_ParameterArrayComponent_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT225_ParameterArrayComponent_ObjectInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		AGT225_ParameterArrayComponent_ObjectInstanceVariable b = new AGT225_ParameterArrayComponent_ObjectInstanceVariable();
		b.f1 = p[0];
	}
	
	public static void main(String[] args) {
		AGT225_ParameterArrayComponent_ObjectInstanceVariable a = new AGT225_ParameterArrayComponent_ObjectInstanceVariable();
		System.out.println(a);
		a.foo(a.f2);
		System.out.println(a);
	}

}
