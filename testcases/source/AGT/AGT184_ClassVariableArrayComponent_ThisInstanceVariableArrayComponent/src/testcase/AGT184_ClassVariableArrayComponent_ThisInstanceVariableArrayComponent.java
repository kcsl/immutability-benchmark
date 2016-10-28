package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent a = new AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1[0] = AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent.f2[0];
	}

}
