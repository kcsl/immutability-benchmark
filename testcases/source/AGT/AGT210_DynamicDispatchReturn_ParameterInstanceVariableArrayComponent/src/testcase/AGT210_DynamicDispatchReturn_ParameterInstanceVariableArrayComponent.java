package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT210_DynamicDispatchReturn_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT210_DynamicDispatchReturn_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT210_DynamicDispatchReturn_ParameterInstanceVariableArrayComponent test = new AGT210_DynamicDispatchReturn_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT210_DynamicDispatchReturn_ParameterInstanceVariableArrayComponent p){
		p.f[0] = this.bar();
	}

	public Object bar(){
		return new Object();
	}
	
}
