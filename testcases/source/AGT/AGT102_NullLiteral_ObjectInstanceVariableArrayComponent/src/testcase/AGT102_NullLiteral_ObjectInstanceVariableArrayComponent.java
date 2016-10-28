package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT102_NullLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT102_NullLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT102_NullLiteral_ObjectInstanceVariableArrayComponent test = new AGT102_NullLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = null;
		System.out.println(test);
	}
	
}
