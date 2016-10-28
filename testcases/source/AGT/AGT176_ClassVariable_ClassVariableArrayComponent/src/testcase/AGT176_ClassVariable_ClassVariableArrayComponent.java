package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT176_ClassVariable_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT176_ClassVariable_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT176_ClassVariable_ClassVariableArrayComponent test = new AGT176_ClassVariable_ClassVariableArrayComponent();
		System.out.println(test);
		AGT176_ClassVariable_ClassVariableArrayComponent.f1[0] = AGT176_ClassVariable_ClassVariableArrayComponent.f2;
		System.out.println(test);
	}

}
