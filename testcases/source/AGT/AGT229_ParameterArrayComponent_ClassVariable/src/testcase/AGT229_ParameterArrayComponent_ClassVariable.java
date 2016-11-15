package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT229_ParameterArrayComponent_ClassVariable {

	@READONLY
	public static Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		assert(f1 instanceof Object); // Object types are immutable
		return "AGT229_ParameterArrayComponent_ClassVariable [f1=IMMUTABLE" + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		AGT229_ParameterArrayComponent_ClassVariable.f1 = p[0];
	}
	
	public static void main(String[] args) {
		AGT229_ParameterArrayComponent_ClassVariable test = new AGT229_ParameterArrayComponent_ClassVariable();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
