package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT185_ClassVariableArrayComponent_ClassVariable {

	@MUTABLE
	public static Object f1 = new Object();
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT185_ClassVariableArrayComponent_ClassVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT185_ClassVariableArrayComponent_ClassVariable test = new AGT185_ClassVariableArrayComponent_ClassVariable();
		System.out.println(test);
		AGT185_ClassVariableArrayComponent_ClassVariable.f1 = AGT185_ClassVariableArrayComponent_ClassVariable.f2[0];
		System.out.println(test);
	}

}
