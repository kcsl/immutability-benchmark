package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT056_LongLiteral_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT056_LongLiteral_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT056_LongLiteral_ClassVariableArrayComponent test = new AGT056_LongLiteral_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT056_LongLiteral_ClassVariableArrayComponent.f[0] = 1L;
		System.out.println(test.toString());
	}

}
