package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT237_ParameterInstanceVariable_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT237_ParameterInstanceVariable_ThisInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(AGT237_ParameterInstanceVariable_ThisInstanceVariable p){
		this.f1 = p.f2;
	}
	
	public static void main(String[] args) {
		AGT237_ParameterInstanceVariable_ThisInstanceVariable test = new AGT237_ParameterInstanceVariable_ThisInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
