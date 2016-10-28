package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT070_FloatLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT070_FloatLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT070_FloatLiteral_ParameterInstanceVariableArrayComponent test = new AGT070_FloatLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT070_FloatLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = 1.0F;
	}

}
