package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public enum AGT130_Enum_ParameterInstanceVariableArrayComponent {

	A,B;
	
	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT130_Enum_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT130_Enum_ParameterInstanceVariableArrayComponent test = AGT130_Enum_ParameterInstanceVariableArrayComponent.A;
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT130_Enum_ParameterInstanceVariableArrayComponent p){
		p.f[0] = AGT130_Enum_ParameterInstanceVariableArrayComponent.B;
	}

}
