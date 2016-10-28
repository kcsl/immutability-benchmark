package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT052_LongLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT052_LongLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT052_LongLiteral_ObjectInstanceVariableArrayComponent test = new AGT052_LongLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = 1L;
		System.out.println(test);
	}
	
}
