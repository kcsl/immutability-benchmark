package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent test = new AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
	
	public Object[] f1 = new Object[]{ new Object() };
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f1[0] = this.f2[0];
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}