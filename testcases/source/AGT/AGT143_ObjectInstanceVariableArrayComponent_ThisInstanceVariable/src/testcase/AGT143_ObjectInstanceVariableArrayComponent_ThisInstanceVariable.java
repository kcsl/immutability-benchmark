package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable a = new AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable();
		a.foo();
	}
	
	public void foo(){
		AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable b = new AGT143_ObjectInstanceVariableArrayComponent_ThisInstanceVariable();
		System.out.println(this);
		this.f1 = b.f2[0];
		System.out.println(this);
	}

}
