package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT241_ParameterInstanceVariableArrayComponent_Parameter {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT241_ParameterInstanceVariableArrayComponent_Parameter [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object p1, AGT241_ParameterInstanceVariableArrayComponent_Parameter p2){
		p1 = p2.f2[0];
	}
	
	public static void main(String[] args) {
		AGT241_ParameterInstanceVariableArrayComponent_Parameter test = new AGT241_ParameterInstanceVariableArrayComponent_Parameter();
		System.out.println(test);
		test.foo(test.f1, test);
		System.out.println(test);
	}

}
