package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT196_StaticDispatchReturn_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT196_StaticDispatchReturn_ClassVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT196_StaticDispatchReturn_ClassVariableArrayComponent test = new AGT196_StaticDispatchReturn_ClassVariableArrayComponent();
		System.out.println(test.toString());
		AGT196_StaticDispatchReturn_ClassVariableArrayComponent.f[0] = bar();
		System.out.println(test.toString());
	}

	public static Object bar(){
		return new Object();
	}
	
}
