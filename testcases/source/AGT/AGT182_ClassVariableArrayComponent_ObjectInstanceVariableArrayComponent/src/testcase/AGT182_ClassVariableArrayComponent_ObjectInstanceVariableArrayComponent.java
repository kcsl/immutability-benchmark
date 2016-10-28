package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent a = new AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent b = new AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		b.f1[0] = AGT182_ClassVariableArrayComponent_ObjectInstanceVariableArrayComponent.f2[0];
	}

}
