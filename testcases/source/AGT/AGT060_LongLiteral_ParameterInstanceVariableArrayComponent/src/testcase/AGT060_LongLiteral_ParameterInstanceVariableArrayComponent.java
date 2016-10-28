package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT060_LongLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT060_LongLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT060_LongLiteral_ParameterInstanceVariableArrayComponent test = new AGT060_LongLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT060_LongLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = 1L;
	}

}
