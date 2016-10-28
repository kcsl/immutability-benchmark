package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT233_ParameterInstanceVariable_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT233_ParameterInstanceVariable_ParameterInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT233_ParameterInstanceVariable_ParameterInstanceVariable p1, AGT233_ParameterInstanceVariable_ParameterInstanceVariable p2){
		p1.f1 = p2.f2;
	}
	
	public static void main(String[] args) {
		AGT233_ParameterInstanceVariable_ParameterInstanceVariable test = new AGT233_ParameterInstanceVariable_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test, test);
		System.out.println(test);
	}

}
