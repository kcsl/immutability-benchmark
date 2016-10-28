package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent a = new AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent();
		AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent b = new AGT132_ObjectInstanceVariable_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.f1[0] = b.f2;
		System.out.println(a);
	}

}
