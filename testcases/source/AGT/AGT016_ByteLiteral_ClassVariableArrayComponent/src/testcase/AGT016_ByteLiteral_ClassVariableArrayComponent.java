package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT016_ByteLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT016_ByteLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT016_ByteLiteral_ClassVariableArrayComponent test = new AGT016_ByteLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT016_ByteLiteral_ClassVariableArrayComponent.f[0] = (byte) 0x01;
		System.out.println(test.toString());
	}

}
