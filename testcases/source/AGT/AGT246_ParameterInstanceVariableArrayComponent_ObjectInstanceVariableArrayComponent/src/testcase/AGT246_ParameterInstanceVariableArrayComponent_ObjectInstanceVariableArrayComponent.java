package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent p){
		AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent b = new AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		b.f1[0] = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent a = new AGT246_ParameterInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}

}
