package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT167_ThisInstanceVariableArrayComponent_Parameter {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT157_ThisInstanceVariable_Parameter [f1=" + Arrays.toString(f1) + "]";
	}
	
	public static void main(String[] args) {
		AGT167_ThisInstanceVariableArrayComponent_Parameter a = new AGT167_ThisInstanceVariableArrayComponent_Parameter ();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(Object p){
		p = this.f1[0];
	}

}
