package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent a = new AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent();
		System.out.println(a);
		a.foo(a.f1);
		System.out.println(a);
	}
	
	public void foo(Object[] p){
		AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent b = new AGT148_ObjectInstanceVariableArrayComponent_ParameterArrayComponent();
		p[0] = b.f2[0];
	}

}
