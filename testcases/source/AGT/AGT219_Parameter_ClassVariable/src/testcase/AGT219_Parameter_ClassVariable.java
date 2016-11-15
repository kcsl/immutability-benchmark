package testcase;

import annotations.READONLY;

public class AGT219_Parameter_ClassVariable {

	@READONLY
	public static Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT219_Parameter_ClassVariable [f1=IMMUTABLE" + ", f2=" + f2 + "]";
	}
	
	public void foo(Object p){
		AGT219_Parameter_ClassVariable.f1 = p;
	}
	
	public static void main(String[] args) {
		AGT219_Parameter_ClassVariable test = new AGT219_Parameter_ClassVariable();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
