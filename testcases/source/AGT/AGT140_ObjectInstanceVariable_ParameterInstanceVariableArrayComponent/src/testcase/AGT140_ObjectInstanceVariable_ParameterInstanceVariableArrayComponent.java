package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent a = new AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent p){
		AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent b = new AGT140_ObjectInstanceVariable_ParameterInstanceVariableArrayComponent();
		p.f1[0] = b.f2;
	}

}
