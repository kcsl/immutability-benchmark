package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT096_StringLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT096_StringLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT096_StringLiteral_ClassVariableArrayComponent test = new AGT096_StringLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT096_StringLiteral_ClassVariableArrayComponent.f[0] = "1";
		System.out.println(test.toString());
	}

}
