package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public enum AGT122_Enum_ObjectInstanceVariableArrayComponent {

	A,B;
	
	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT122_Enum_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT122_Enum_ObjectInstanceVariableArrayComponent test = AGT122_Enum_ObjectInstanceVariableArrayComponent.A;
		System.out.println(test);
		test.f[0] = AGT122_Enum_ObjectInstanceVariableArrayComponent.B;
		System.out.println(test);
	}
	
}
