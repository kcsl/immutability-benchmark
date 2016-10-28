package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + "]";
	}
	
	public static void main(String[] args) {
		AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent a = new AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
		a.foo();
	}

	public void foo(){
		AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent b = new AGT144_ObjectInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(this);
		this.f1[0] = b.f1[0];
		System.out.println(this);
	}
	
}
