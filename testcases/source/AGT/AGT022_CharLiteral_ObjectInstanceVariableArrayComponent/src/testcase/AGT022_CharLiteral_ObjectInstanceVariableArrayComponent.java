package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT022_CharLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT022_CharLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT022_CharLiteral_ObjectInstanceVariableArrayComponent test = new AGT022_CharLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = '1';
		System.out.println(test);
	}
	
}
