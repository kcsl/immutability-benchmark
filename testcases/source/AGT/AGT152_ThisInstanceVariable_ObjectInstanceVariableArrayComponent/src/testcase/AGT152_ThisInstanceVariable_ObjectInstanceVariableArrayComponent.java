package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f1 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + "]";
	}
	
	public static void main(String[] args) {
		AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent a = new AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent b = new AGT152_ThisInstanceVariable_ObjectInstanceVariableArrayComponent();
		b.f1[0] = this.f1;
	}

}
