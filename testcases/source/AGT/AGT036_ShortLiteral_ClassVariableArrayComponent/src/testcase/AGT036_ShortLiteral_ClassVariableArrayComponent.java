package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT036_ShortLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT036_ShortLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT036_ShortLiteral_ClassVariableArrayComponent test = new AGT036_ShortLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT036_ShortLiteral_ClassVariableArrayComponent.f[0] = (short) 1;
		System.out.println(test.toString());
	}

}
