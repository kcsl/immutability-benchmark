package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent test = new AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent();
		System.out.println(test);
		AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent.f1[0] = AGT186_ClassVariableArrayComponent_ClassVariableArrayComponent.f2[0];
		System.out.println(test);
	}

}
