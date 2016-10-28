package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent a = new AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent b = new AGT162_ThisInstanceVariableArrayComponent_ObjectInstanceVariableArrayComponent();
		b.f1[0] = this.f2[0];
	}

}
