package testcase;

import annotations.MUTABLE;

public class AGT079_DoubleLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT079_DoubleLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT079_DoubleLiteral_ParameterInstanceVariable test = new AGT079_DoubleLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT079_DoubleLiteral_ParameterInstanceVariable p){
		p.f = 1.0;
	}

}
