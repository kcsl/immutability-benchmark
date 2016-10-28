package testcase;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT217_Parameter_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT217_Parameter_ThisInstanceVariable [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(Object p){
		this.f1 = p;
	}
	
	public static void main(String[] args) {
		AGT217_Parameter_ThisInstanceVariable test = new AGT217_Parameter_ThisInstanceVariable();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
