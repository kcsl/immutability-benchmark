package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT046_IntLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT046_IntLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT046_IntLiteral_ClassVariableArrayComponent test = new AGT046_IntLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT046_IntLiteral_ClassVariableArrayComponent.f[0] = (int) 1;
		System.out.println(test.toString());
	}

}
