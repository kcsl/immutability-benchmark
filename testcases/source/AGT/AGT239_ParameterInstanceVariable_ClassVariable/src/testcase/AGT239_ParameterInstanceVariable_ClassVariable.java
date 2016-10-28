package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT239_ParameterInstanceVariable_ClassVariable {

	@MUTABLE
	public static Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT239_ParameterInstanceVariable_ClassVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT239_ParameterInstanceVariable_ClassVariable p){
		AGT239_ParameterInstanceVariable_ClassVariable.f1 = p.f2;
	}
	
	public static void main(String[] args) {
		AGT239_ParameterInstanceVariable_ClassVariable test = new AGT239_ParameterInstanceVariable_ClassVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
