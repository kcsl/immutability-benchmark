package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent test = new AGT202_DynamicDispatchReturn_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = test.bar();
		System.out.println(test);
	}
	
	public Object bar(){
		return new Object();
	}
	
}
