package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT146_ObjectInstanceVariableArrayComponent_ClassVariableArrayComponent {
	
	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT146_ObjectInstanceVariableArrayComponent_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT146_ObjectInstanceVariableArrayComponent_ClassVariableArrayComponent test = new AGT146_ObjectInstanceVariableArrayComponent_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT146_ObjectInstanceVariableArrayComponent_ClassVariableArrayComponent.f1[0] = test.f2[0];
		System.out.println(test.toString());
	}

}
