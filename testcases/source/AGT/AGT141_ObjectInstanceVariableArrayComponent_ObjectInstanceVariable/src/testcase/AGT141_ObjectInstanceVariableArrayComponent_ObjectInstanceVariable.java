package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable a = new AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable();
		AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable b = new AGT141_ObjectInstanceVariableArrayComponent_ObjectInstanceVariable();
		System.out.println(a);
		a.f1 = b.f2[0];
		System.out.println(a);
	}

}
