package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT172_ClassVariable_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT172_ClassVariable_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT172_ClassVariable_ObjectInstanceVariableArrayComponent a = new AGT172_ClassVariable_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT172_ClassVariable_ObjectInstanceVariableArrayComponent b = new AGT172_ClassVariable_ObjectInstanceVariableArrayComponent();
		b.f1[0] = AGT172_ClassVariable_ObjectInstanceVariableArrayComponent.f2;
	}

}
