package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT106_NullLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT106_NullLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT106_NullLiteral_ClassVariableArrayComponent test = new AGT106_NullLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT106_NullLiteral_ClassVariableArrayComponent.f[0] = null;
		System.out.println(test.toString());
	}

}
