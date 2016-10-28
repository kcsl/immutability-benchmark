package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT249_ParameterInstanceVariableArrayComponent_ClassVariable {

	@MUTABLE
	public static Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT239_ParameterInstanceVariable_ClassVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT249_ParameterInstanceVariableArrayComponent_ClassVariable p){
		AGT249_ParameterInstanceVariableArrayComponent_ClassVariable.f1 = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT249_ParameterInstanceVariableArrayComponent_ClassVariable test = new AGT249_ParameterInstanceVariableArrayComponent_ClassVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
