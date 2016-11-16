package testcase;

import annotations.MUTABLE;

public class AGT183_ClassVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public static AGT183_ClassVariableArrayComponent_ThisInstanceVariable test = new AGT183_ClassVariableArrayComponent_ThisInstanceVariable();
	
	public Object f1 = new Object();
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT183_ClassVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1 = AGT183_ClassVariableArrayComponent_ThisInstanceVariable.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}