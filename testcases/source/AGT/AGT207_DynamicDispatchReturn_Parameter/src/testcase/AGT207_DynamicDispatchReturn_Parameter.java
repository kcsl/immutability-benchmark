package testcase;

import annotations.READONLY;

public class AGT207_DynamicDispatchReturn_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT207_DynamicDispatchReturn_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT207_DynamicDispatchReturn_Parameter test = new AGT207_DynamicDispatchReturn_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = this.bar();
	}

	public Object bar(){
		return new Object();
	}
	
}
