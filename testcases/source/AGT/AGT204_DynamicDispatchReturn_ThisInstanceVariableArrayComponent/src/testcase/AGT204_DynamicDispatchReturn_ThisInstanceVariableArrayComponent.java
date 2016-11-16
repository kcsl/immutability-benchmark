package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT204_DynamicDispatchReturn_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT204_DynamicDispatchReturn_ThisInstanceVariableArrayComponent test = new AGT204_DynamicDispatchReturn_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT204_DynamicDispatchReturn_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public Object bar(){
		return new Object();
	}
	
	public void foo(){
		System.out.println(this.toString());
		this.f[0] = this.bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}