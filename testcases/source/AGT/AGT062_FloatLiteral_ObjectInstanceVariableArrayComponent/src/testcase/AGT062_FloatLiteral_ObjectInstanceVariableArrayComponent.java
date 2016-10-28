package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT062_FloatLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT062_FloatLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT062_FloatLiteral_ObjectInstanceVariableArrayComponent test = new AGT062_FloatLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = 1.0F;
		System.out.println(test);
	}
	
}
