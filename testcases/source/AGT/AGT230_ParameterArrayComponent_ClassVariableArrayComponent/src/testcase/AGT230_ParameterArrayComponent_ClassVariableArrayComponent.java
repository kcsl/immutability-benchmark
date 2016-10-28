package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT230_ParameterArrayComponent_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT230_ParameterArrayComponent_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		AGT230_ParameterArrayComponent_ClassVariableArrayComponent.f1[0] = p[0];
	}
	
	public static void main(String[] args) {
		AGT230_ParameterArrayComponent_ClassVariableArrayComponent test = new AGT230_ParameterArrayComponent_ClassVariableArrayComponent();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
