package testcase;

import annotations.MUTABLE;

public class AGT009_FinalObject_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT009_FinalObject_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT009_FinalObject_ParameterInstanceVariable test = new AGT009_FinalObject_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT009_FinalObject_ParameterInstanceVariable p){
		final Object o = new Object();
		p.f = o;
	}

}
