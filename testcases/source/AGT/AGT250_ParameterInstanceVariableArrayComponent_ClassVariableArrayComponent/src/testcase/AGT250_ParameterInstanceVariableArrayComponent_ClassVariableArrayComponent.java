package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent p){
		AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent.f1[0] = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent test = new AGT250_ParameterInstanceVariableArrayComponent_ClassVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
