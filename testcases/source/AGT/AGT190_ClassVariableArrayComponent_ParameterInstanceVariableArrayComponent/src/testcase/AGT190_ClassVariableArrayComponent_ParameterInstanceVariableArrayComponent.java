package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent a = new AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent p){
		p.f1[0] = AGT190_ClassVariableArrayComponent_ParameterInstanceVariableArrayComponent.f2[0];
	}

}
