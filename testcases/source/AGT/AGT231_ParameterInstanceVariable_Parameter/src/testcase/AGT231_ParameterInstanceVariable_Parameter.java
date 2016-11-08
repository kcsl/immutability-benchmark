package testcase;

import annotations.READONLY;

public class AGT231_ParameterInstanceVariable_Parameter {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT231_ParameterInstanceVariable_Parameter [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(Object p1, AGT231_ParameterInstanceVariable_Parameter p2){
		p1 = p2.f2;
	}
	
	public static void main(String[] args) {
		AGT231_ParameterInstanceVariable_Parameter test = new AGT231_ParameterInstanceVariable_Parameter();
		System.out.println(test);
		test.foo(test.f1, test);
		System.out.println(test);
	}

}
