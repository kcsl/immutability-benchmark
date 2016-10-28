package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT002_FinalObject_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT002_FinalObject_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT002_FinalObject_ObjectInstanceVariableArrayComponent test = new AGT002_FinalObject_ObjectInstanceVariableArrayComponent();
		final Object o = new Object();
		System.out.println(test);
		test.f[0] = o;
		System.out.println(test);
	}
	
}
