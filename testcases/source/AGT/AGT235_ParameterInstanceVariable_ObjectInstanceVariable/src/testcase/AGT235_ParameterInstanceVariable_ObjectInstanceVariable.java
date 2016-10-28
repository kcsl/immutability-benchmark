package testcase;

import annotations.READONLY;

public class AGT235_ParameterInstanceVariable_ObjectInstanceVariable {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT235_ParameterInstanceVariable_ObjectInstanceVariable [f=" + f + "]";
	}
	
	public void foo(AGT235_ParameterInstanceVariable_ObjectInstanceVariable p){
		AGT235_ParameterInstanceVariable_ObjectInstanceVariable b = new AGT235_ParameterInstanceVariable_ObjectInstanceVariable();
		b.f = p.f;
	}
	
	public static void main(String[] args) {
		AGT235_ParameterInstanceVariable_ObjectInstanceVariable a = new AGT235_ParameterInstanceVariable_ObjectInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}

}
