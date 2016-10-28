package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent a = new AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1[0] = this.f2;
	}

}
