package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT004_FinalObject_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT004_FinalObject_ThisInstanceVariableArrayComponent test = new AGT004_FinalObject_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT004_FinalObject_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		final Object o = new Object();
		System.out.println(this.toString());
		this.f[0] = o;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}