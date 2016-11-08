package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT200_StaticDispatchReturn_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT200_StaticDispatchReturn_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT200_StaticDispatchReturn_ParameterInstanceVariableArrayComponent test = new AGT200_StaticDispatchReturn_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT200_StaticDispatchReturn_ParameterInstanceVariableArrayComponent p){
		p.f[0] = bar();
	}

	public static Object bar(){
		return new Object();
	}
	
}
