package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT159_ThisInstanceVariable_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT159_ThisInstanceVariable_ParameterInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT159_ThisInstanceVariable_ParameterInstanceVariable a = new AGT159_ThisInstanceVariable_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT159_ThisInstanceVariable_ParameterInstanceVariable p){
		p.f1 = this.f2;
	}

}
