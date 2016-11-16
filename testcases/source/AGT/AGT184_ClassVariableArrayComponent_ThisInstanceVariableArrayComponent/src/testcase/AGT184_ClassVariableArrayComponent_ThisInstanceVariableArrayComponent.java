package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent test = new AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public static Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1[0] = AGT184_ClassVariableArrayComponent_ThisInstanceVariableArrayComponent.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}