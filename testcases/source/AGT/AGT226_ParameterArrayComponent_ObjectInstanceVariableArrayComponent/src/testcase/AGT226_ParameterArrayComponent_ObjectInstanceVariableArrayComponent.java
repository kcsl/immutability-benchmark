package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent b = new AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent();
		b.f1[0] = p[0];
	}
	
	public static void main(String[] args) {
		AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent a = new AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a.f2);
		System.out.println(a);
	}

}
