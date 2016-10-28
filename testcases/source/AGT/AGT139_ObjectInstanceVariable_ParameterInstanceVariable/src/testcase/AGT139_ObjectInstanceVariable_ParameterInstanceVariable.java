package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT139_ObjectInstanceVariable_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT139_ObjectInstanceVariable_ParameterInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT139_ObjectInstanceVariable_ParameterInstanceVariable a = new AGT139_ObjectInstanceVariable_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT139_ObjectInstanceVariable_ParameterInstanceVariable p){
		AGT139_ObjectInstanceVariable_ParameterInstanceVariable b = new AGT139_ObjectInstanceVariable_ParameterInstanceVariable();
		p.f1 = b.f2;
	}

}
