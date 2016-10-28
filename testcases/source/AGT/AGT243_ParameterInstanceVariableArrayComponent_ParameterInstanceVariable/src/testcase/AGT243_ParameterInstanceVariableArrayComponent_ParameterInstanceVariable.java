package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable p1, AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable p2){
		p1.f1 = p2.f2[0];
	}
	
	public static void main(String[] args) {
		AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable test = new AGT243_ParameterInstanceVariableArrayComponent_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test, test);
		System.out.println(test);
	}

}
