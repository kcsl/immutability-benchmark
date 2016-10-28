package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable p){
		AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable b = new AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable();
		b.f1 = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable a = new AGT245_ParameterInstanceVariableArrayComponent_ObjectInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}

}
