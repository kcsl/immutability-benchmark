package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT006_FinalObject_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT006_FinalObject_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT006_FinalObject_ClassVariableArrayComponent test = new AGT006_FinalObject_ClassVariableArrayComponent();
		final Object o = new Object();
		System.out.println(test.toString());
		AGT006_FinalObject_ClassVariableArrayComponent.f[0] = o;
		System.out.println(test.toString());
	}

}
