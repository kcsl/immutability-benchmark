package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT187_ClassVariableArrayComponent_Parameter {

	@READONLY
	public static Object[] f1 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT187_ClassVariableArrayComponent_Parameter [f1=" + Arrays.toString(f1) + "]";
	}
	
	public static void main(String[] args) {
		AGT187_ClassVariableArrayComponent_Parameter a = new AGT187_ClassVariableArrayComponent_Parameter ();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(Object p){
		p = AGT187_ClassVariableArrayComponent_Parameter.f1[0];
	}

}
