package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT213_Parameter_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT213_Parameter_ParameterInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT213_Parameter_ParameterInstanceVariable p1, Object p2){
		p1.f1 = p2;
	}
	
	public static void main(String[] args) {
		AGT213_Parameter_ParameterInstanceVariable test = new AGT213_Parameter_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test, test.f2);
		System.out.println(test);
	}

}
