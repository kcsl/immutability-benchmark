package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT026_CharLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT026_CharLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT026_CharLiteral_ClassVariableArrayComponent test = new AGT026_CharLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT026_CharLiteral_ClassVariableArrayComponent.f[0] = '1';
		System.out.println(test.toString());
	}

}
