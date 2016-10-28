package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT072_DoubleLiteral_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT072_DoubleLiteral_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT072_DoubleLiteral_ObjectInstanceVariableArrayComponent test = new AGT072_DoubleLiteral_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = 1.0;
		System.out.println(test);
	}
	
}
