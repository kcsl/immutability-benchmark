package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT224_ParameterArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT224_ParameterArrayComponent_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT224_ParameterArrayComponent_ParameterInstanceVariableArrayComponent p1, Object[] p2){
		p1.f1[0] = p2[0];
	}
	
	public static void main(String[] args) {
		AGT224_ParameterArrayComponent_ParameterInstanceVariableArrayComponent test = new AGT224_ParameterArrayComponent_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test, test.f2);
		System.out.println(test);
	}

}
