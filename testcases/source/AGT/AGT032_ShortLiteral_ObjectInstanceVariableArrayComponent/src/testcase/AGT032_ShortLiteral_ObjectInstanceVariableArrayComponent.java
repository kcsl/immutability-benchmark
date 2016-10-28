package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT032_ShortLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT032_ShortLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT032_ShortLiteral_ObjectInstanceVariableArrayComponent test = new AGT032_ShortLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = (short) 1;
		System.out.println(test);
	}
	
}
