package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable {

	@MUTABLE
	public static AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable test = new AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable();
	
	public Object f1 = new Object();
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT163_ThisInstanceVariableArrayComponent_ThisInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1 = this.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}