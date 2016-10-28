package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT074_DoubleLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT074_DoubleLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = 1.0;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT074_DoubleLiteral_ThisInstanceVariableArrayComponent test = new AGT074_DoubleLiteral_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
