package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent p1, AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent p2){
		p1.f1[0] = p2.f2;
	}
	
	public static void main(String[] args) {
		AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent test = new AGT234_ParameterInstanceVariable_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test, test);
		System.out.println(test);
	}

}
