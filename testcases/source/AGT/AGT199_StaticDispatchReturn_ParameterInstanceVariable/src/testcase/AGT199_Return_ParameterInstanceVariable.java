package testcase;

import annotations.MUTABLE;

public class AGT199_Return_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT199_Return_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT199_Return_ParameterInstanceVariable test = new AGT199_Return_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT199_Return_ParameterInstanceVariable p){
		p.f = bar();
	}

	public static Object bar(){
		return new Object();
	}
	
}
