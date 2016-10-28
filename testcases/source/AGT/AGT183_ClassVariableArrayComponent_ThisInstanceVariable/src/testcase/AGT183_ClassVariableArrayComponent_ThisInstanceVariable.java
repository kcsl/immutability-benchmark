package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT183_ClassVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT183_ClassVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT183_ClassVariableArrayComponent_ThisInstanceVariable a = new AGT183_ClassVariableArrayComponent_ThisInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1 = AGT183_ClassVariableArrayComponent_ThisInstanceVariable.f2[0];
	}

}
