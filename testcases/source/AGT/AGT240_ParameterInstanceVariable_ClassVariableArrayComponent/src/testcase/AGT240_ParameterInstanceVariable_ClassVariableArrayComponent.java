package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT240_ParameterInstanceVariable_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT240_ParameterInstanceVariable_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT240_ParameterInstanceVariable_ClassVariableArrayComponent p){
		AGT240_ParameterInstanceVariable_ClassVariableArrayComponent.f1[0] = p.f2;
	}
	
	public static void main(String[] args) {
		AGT240_ParameterInstanceVariable_ClassVariableArrayComponent test = new AGT240_ParameterInstanceVariable_ClassVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
