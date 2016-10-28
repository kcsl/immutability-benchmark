package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT020_ByteLiteral_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT020_ByteLiteral_ParameterInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT020_ByteLiteral_ParameterInstanceVariableArrayComponent test = new AGT020_ByteLiteral_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT020_ByteLiteral_ParameterInstanceVariableArrayComponent p){
		p.f[0] = (byte) 0x01;
	}

}
