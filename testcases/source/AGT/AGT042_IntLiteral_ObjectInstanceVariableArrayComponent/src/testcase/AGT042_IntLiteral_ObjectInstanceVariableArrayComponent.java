package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT042_IntLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT042_IntLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT042_IntLiteral_ObjectInstanceVariableArrayComponent test = new AGT042_IntLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = (int) 1;
		System.out.println(test);
	}
	
}
