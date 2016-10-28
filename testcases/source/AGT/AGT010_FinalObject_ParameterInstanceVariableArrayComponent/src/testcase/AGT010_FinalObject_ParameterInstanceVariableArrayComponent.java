package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT010_FinalObject_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT010_FinalObject_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT010_FinalObject_ParameterInstanceVariableArrayComponent test = new AGT010_FinalObject_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT010_FinalObject_ParameterInstanceVariableArrayComponent p){
		final Object o = new Object();
		p.f[0] = o;
	}

}
