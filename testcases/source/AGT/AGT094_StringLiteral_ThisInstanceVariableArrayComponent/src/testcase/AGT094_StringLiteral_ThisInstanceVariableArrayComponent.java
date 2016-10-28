package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT094_StringLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT094_StringLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = "1";
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT094_StringLiteral_ThisInstanceVariableArrayComponent test = new AGT094_StringLiteral_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
