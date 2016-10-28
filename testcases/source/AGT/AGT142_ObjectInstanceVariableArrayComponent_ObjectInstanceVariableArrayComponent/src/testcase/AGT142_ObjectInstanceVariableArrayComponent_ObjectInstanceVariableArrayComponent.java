package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent a = new AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent b = new AGT142_ObjectInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.f1[0] = b.f2[0];
		System.out.println(a);
	}

}
