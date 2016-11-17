package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public static AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable test = new AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable();
	
	public Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}

	public void foo(){
		AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable o = new AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable();
		System.out.println(this.toString());
		this.f1 = o.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}