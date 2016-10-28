package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT222_ParameterArrayComponent_ParameterArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT222_ParameterArrayComponent_ParameterArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p1, Object[] p2){
		p1[0] = p2[0];
	}
	
	public static void main(String[] args) {
		AGT222_ParameterArrayComponent_ParameterArrayComponent test = new AGT222_ParameterArrayComponent_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f1, test.f2);
		System.out.println(test);
	}

}
