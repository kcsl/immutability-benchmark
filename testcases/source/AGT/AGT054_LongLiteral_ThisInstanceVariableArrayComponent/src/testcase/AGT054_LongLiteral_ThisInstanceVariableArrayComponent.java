package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT054_LongLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT054_LongLiteral_ThisInstanceVariableArrayComponent test = new AGT054_LongLiteral_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT054_LongLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = 1L;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}