package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT223_ParameterArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT223_ParameterArrayComponent_ParameterInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT223_ParameterArrayComponent_ParameterInstanceVariable p1, Object[] p2){
		p1.f1 = p2[0];
	}
	
	public static void main(String[] args) {
		AGT223_ParameterArrayComponent_ParameterInstanceVariable test = new AGT223_ParameterArrayComponent_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test, test.f2);
		System.out.println(test);
	}

}
