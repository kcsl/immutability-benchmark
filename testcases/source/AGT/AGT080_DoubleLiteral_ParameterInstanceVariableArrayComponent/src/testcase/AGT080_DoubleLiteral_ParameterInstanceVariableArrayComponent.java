package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT080_DoubleLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT080_DoubleLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT080_DoubleLiteral_ParameterInstanceVariableArrayComponent test = new AGT080_DoubleLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT080_DoubleLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = 1.0;
	}

}
