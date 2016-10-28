package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT189_ClassVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT189_ClassVariableArrayComponent_ParameterInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT189_ClassVariableArrayComponent_ParameterInstanceVariable a = new AGT189_ClassVariableArrayComponent_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT189_ClassVariableArrayComponent_ParameterInstanceVariable p){
		p.f1 = AGT189_ClassVariableArrayComponent_ParameterInstanceVariable.f2[0];
	}

}
