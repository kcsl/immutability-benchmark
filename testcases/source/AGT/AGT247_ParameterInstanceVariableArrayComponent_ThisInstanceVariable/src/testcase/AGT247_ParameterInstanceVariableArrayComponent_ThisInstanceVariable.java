package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT247_ParameterInstanceVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT247_ParameterInstanceVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT247_ParameterInstanceVariableArrayComponent_ThisInstanceVariable p){
		this.f1 = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT247_ParameterInstanceVariableArrayComponent_ThisInstanceVariable test = new AGT247_ParameterInstanceVariableArrayComponent_ThisInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
