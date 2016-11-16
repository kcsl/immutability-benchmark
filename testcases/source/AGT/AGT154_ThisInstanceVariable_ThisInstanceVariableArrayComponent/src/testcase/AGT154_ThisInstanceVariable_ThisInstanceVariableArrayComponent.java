package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent test = new AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT154_ThisInstanceVariable_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1[0] = this.f2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}