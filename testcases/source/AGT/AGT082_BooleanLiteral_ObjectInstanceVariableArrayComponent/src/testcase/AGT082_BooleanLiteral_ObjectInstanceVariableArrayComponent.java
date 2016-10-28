package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT082_BooleanLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT082_BooleanLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT082_BooleanLiteral_ObjectInstanceVariableArrayComponent test = new AGT082_BooleanLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = true;
		System.out.println(test);
	}
	
}
