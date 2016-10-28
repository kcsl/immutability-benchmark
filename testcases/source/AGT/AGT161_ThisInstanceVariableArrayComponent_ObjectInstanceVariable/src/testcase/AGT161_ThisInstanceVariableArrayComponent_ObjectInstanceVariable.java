package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable a = new AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable b = new AGT161_ThisInstanceVariableArrayComponent_ObjectInstanceVariable();
		b.f1 = this.f2[0];
	}

}
