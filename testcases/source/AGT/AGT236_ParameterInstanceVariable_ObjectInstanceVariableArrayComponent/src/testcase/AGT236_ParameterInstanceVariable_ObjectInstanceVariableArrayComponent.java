package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public void foo(AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent p){
		AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent b = new AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent();
		b.f[0] = p.f;
	}
	
	public static void main(String[] args) {
		AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent a = new AGT236_ParameterInstanceVariable_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}

}
