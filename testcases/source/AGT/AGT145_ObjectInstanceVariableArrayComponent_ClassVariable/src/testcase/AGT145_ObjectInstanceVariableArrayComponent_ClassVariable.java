package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT145_ObjectInstanceVariableArrayComponent_ClassVariable {
	
	@READONLY
	public static Object f1 = new Object();

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		assert(f1 instanceof Object); // Object types are immutable
		return "AGT145_ObjectInstanceVariableArrayComponent_ClassVariable [f1=IMMUTABLE" + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT145_ObjectInstanceVariableArrayComponent_ClassVariable test = new AGT145_ObjectInstanceVariableArrayComponent_ClassVariable();
		System.out.println(test.toString());
		AGT145_ObjectInstanceVariableArrayComponent_ClassVariable.f1 = test.f2[0];
		System.out.println(test.toString());
	}

}
