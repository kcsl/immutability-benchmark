package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT208_DynamicDispatchReturn_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT208_DynamicDispatchReturn_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT208_DynamicDispatchReturn_ParameterArrayComponent test = new AGT208_DynamicDispatchReturn_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = this.bar();
	}
	
	public Object bar(){
		return new Object();
	}

}
