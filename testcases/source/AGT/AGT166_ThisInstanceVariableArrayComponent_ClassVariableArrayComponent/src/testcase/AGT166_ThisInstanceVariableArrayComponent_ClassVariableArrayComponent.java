package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent a = new AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent ();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT166_ThisInstanceVariableArrayComponent_ClassVariableArrayComponent.f1[0] = this.f2[0];
	}

}
