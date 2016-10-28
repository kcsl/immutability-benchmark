package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT012_ByteLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT012_ByteLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT012_ByteLiteral_ObjectInstanceVariableArrayComponent test = new AGT012_ByteLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = (byte) 0x01;
		System.out.println(test);
	}
	
}
