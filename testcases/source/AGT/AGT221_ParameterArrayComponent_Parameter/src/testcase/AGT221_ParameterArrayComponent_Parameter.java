package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT221_ParameterArrayComponent_Parameter {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT221_ParameterArrayComponent_Parameter [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object p1, Object[] p2){
		p1 = p2[0];
	}
	
	public static void main(String[] args) {
		AGT221_ParameterArrayComponent_Parameter test = new AGT221_ParameterArrayComponent_Parameter();
		System.out.println(test);
		test.foo(test.f1, test.f2);
		System.out.println(test);
	}

}
