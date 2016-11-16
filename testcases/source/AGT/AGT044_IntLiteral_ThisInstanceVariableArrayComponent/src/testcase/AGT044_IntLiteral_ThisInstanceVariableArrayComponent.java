package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT044_IntLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT044_IntLiteral_ThisInstanceVariableArrayComponent test = new AGT044_IntLiteral_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT044_IntLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = (int) 1;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}