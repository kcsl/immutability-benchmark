package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent a = new AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent b = new AGT134_ObjectInstanceVariable_ThisInstanceVariableArrayComponent();
		this.f[0] = b.f;
	}

}
