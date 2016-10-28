package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent a = new AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent p){
		AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent b = new AGT150_ObjectInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent();
		p.f1[0] = b.f2[0];
	}

}
