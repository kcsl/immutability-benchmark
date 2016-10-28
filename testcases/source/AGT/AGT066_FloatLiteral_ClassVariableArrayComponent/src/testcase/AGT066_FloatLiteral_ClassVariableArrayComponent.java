package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT066_FloatLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT066_FloatLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT066_FloatLiteral_ClassVariableArrayComponent test = new AGT066_FloatLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT066_FloatLiteral_ClassVariableArrayComponent.f[0] = 1.0F;
		System.out.println(test.toString());
	}

}
