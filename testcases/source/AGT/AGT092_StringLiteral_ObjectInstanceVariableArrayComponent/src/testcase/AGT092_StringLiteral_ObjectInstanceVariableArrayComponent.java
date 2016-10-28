package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT092_StringLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT092_StringLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT092_StringLiteral_ObjectInstanceVariableArrayComponent test = new AGT092_StringLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = "1";
		System.out.println(test);
	}
	
}
