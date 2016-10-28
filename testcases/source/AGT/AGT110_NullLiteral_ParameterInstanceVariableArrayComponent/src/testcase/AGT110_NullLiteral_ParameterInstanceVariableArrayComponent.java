package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT110_NullLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT110_NullLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT110_NullLiteral_ParameterInstanceVariableArrayComponent test = new AGT110_NullLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT110_NullLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = null;
	}

}
