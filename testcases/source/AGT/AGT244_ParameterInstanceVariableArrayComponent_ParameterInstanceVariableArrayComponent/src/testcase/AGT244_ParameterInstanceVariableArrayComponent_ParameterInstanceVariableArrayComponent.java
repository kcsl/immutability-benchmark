package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent p1, AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent p2){
		p1.f1[0] = p2.f2[0];
	}
	
	public static void main(String[] args) {
		AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent test = new AGT244_ParameterInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test, test);
		System.out.println(test);
	}

}
