package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT194_StaticDispatchReturn_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT194_StaticDispatchReturn_ThisInstanceVariableArrayComponent test = new AGT194_StaticDispatchReturn_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT194_StaticDispatchReturn_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public static Object bar(){
		return new Object();
	}
	
	public void foo(){
		System.out.println(this.toString());
		this.f[0] = AGT194_StaticDispatchReturn_ThisInstanceVariableArrayComponent.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}