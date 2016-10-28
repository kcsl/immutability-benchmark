package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT136_ObjectInstanceVariable_ClassVariableArrayComponent {
	
	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT135_ObjectInstanceVariable_ClassVariable [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT136_ObjectInstanceVariable_ClassVariableArrayComponent test = new AGT136_ObjectInstanceVariable_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT136_ObjectInstanceVariable_ClassVariableArrayComponent.f1[0] = test.f2;
		System.out.println(test.toString());
	}

}
