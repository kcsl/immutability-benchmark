package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT238_ParameterInstanceVariable_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT238_ParameterInstanceVariable_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public void foo(AGT238_ParameterInstanceVariable_ThisInstanceVariableArrayComponent p){
		this.f[0] = p.f;
	}
	
	public static void main(String[] args) {
		AGT238_ParameterInstanceVariable_ThisInstanceVariableArrayComponent test = new AGT238_ParameterInstanceVariable_ThisInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
