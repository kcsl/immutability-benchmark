package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable a = new AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable p){
		AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable b = new AGT149_ObjectInstanceVariableArrayComponent_ParameterInstanceVariable();
		p.f1 = b.f2[0];
	}

}
