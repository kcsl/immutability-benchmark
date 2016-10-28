package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable a = new AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1 = this.f2[0];
	}

}
