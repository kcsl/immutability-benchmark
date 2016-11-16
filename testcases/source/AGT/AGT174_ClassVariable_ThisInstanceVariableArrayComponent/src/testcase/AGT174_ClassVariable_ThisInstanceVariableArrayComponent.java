package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT174_ClassVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT174_ClassVariable_ThisInstanceVariableArrayComponent test = new AGT174_ClassVariable_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public static Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT174_ClassVariable_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1[0] = AGT174_ClassVariable_ThisInstanceVariableArrayComponent.f2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}