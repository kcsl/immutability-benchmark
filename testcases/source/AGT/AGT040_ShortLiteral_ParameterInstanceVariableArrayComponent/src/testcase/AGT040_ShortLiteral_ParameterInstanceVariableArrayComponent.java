package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT040_ShortLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT040_ShortLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT040_ShortLiteral_ParameterInstanceVariableArrayComponent test = new AGT040_ShortLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT040_ShortLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = (short) 1;
	}

}
