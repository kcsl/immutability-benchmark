package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT014_ByteLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT014_ByteLiteral_ThisInstanceVariableArrayComponent test = new AGT014_ByteLiteral_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT014_ByteLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = (byte) 0x01;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}