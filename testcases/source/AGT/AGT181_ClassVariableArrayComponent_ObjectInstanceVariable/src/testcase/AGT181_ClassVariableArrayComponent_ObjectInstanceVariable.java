package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT181_ClassVariableArrayComponent_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT181_ClassVariableArrayComponent_ObjectInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT181_ClassVariableArrayComponent_ObjectInstanceVariable a = new AGT181_ClassVariableArrayComponent_ObjectInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT181_ClassVariableArrayComponent_ObjectInstanceVariable b = new AGT181_ClassVariableArrayComponent_ObjectInstanceVariable();
		b.f1 = AGT181_ClassVariableArrayComponent_ObjectInstanceVariable.f2[0];
	}

}
