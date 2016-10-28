package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT206_DynamicDispatchReturn_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT206_DynamicDispatchReturn_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT206_DynamicDispatchReturn_ClassVariableArrayComponent test = new AGT206_DynamicDispatchReturn_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT206_DynamicDispatchReturn_ClassVariableArrayComponent.f[0] = test.bar();
		System.out.println(test.toString());
	}

	public Object bar(){
		return new Object();
	}
	
}
