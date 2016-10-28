package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT227_ParameterArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT227_ParameterArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		this.f1 = p[0];
	}
	
	public static void main(String[] args) {
		AGT227_ParameterArrayComponent_ThisInstanceVariable test = new AGT227_ParameterArrayComponent_ThisInstanceVariable();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
