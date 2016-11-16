package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent test = new AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}

	public void foo(){
		AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent test2 = new AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent();
		System.out.println(this.toString());
		this.f1[0] = test2.f2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}