package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT050_IntLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT050_IntLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT050_IntLiteral_ParameterInstanceVariableArrayComponent test = new AGT050_IntLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT050_IntLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = (int) 1;
	}

}
