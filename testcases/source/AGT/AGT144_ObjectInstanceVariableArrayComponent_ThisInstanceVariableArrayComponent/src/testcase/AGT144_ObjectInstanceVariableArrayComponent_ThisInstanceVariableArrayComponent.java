package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent test = new AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}

	public void foo(){
		AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent test2 = new AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(this.toString());
		this.f1[0] = test2.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}