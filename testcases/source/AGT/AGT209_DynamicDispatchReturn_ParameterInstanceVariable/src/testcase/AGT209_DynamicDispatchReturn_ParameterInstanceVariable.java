package testcase;

import annotations.MUTABLE;

public class AGT209_DynamicDispatchReturn_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT209_DynamicDispatchReturn_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT209_DynamicDispatchReturn_ParameterInstanceVariable test = new AGT209_DynamicDispatchReturn_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT209_DynamicDispatchReturn_ParameterInstanceVariable p){
		p.f = this.bar();
	}

	public Object bar(){
		return new Object();
	}
	
}
