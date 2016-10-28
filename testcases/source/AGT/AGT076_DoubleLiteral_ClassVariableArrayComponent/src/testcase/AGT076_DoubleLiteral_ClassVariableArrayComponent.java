package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT076_DoubleLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT076_DoubleLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT076_DoubleLiteral_ClassVariableArrayComponent test = new AGT076_DoubleLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT076_DoubleLiteral_ClassVariableArrayComponent.f[0] = 1.0;
		System.out.println(test.toString());
	}

}
