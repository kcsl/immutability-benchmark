package testcase;

import annotations.READONLY;

public class AGT239_ParameterInstanceVariable_ClassVariable {

	@READONLY
	public static Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		assert(f1 instanceof Object); // Object types are immutable
		return "AGT239_ParameterInstanceVariable_ClassVariable [f1=IMMUTABLE" + ", f2=" + f2 + "]";
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
