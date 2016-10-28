package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT179_ClassVariable_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public static Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT179_ClassVariable_ParameterInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT179_ClassVariable_ParameterInstanceVariable a = new AGT179_ClassVariable_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT179_ClassVariable_ParameterInstanceVariable p){
		p.f1 = AGT179_ClassVariable_ParameterInstanceVariable.f2;
	}

}
