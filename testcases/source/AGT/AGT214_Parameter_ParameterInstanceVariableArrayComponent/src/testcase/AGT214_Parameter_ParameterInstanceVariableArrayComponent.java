package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT214_Parameter_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT213_Parameter_ParameterInstanceVariable [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT214_Parameter_ParameterInstanceVariableArrayComponent p1, Object p2){
		p1.f1[0] = p2;
	}
	
	public static void main(String[] args) {
		AGT214_Parameter_ParameterInstanceVariableArrayComponent test = new AGT214_Parameter_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test, test.f2);
		System.out.println(test);
	}

}
