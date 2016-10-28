package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT156_ThisInstanceVariable_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT156_ThisInstanceVariable_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT156_ThisInstanceVariable_ClassVariableArrayComponent a = new AGT156_ThisInstanceVariable_ClassVariableArrayComponent ();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT156_ThisInstanceVariable_ClassVariableArrayComponent.f1[0] = this.f2;
	}

}
