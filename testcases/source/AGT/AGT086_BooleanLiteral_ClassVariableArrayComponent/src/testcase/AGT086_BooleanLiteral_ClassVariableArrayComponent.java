package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT086_BooleanLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT086_BooleanLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT086_BooleanLiteral_ClassVariableArrayComponent test = new AGT086_BooleanLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT086_BooleanLiteral_ClassVariableArrayComponent.f[0] = true;
		System.out.println(test.toString());
	}

}
