package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT064_FloatLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT064_FloatLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = 1.0F;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT064_FloatLiteral_ThisInstanceVariableArrayComponent test = new AGT064_FloatLiteral_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
