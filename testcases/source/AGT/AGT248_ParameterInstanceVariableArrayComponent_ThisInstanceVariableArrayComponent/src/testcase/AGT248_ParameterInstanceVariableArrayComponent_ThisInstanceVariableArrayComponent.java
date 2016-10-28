package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent p){
		this.f1[0] = p.f2[0];
	}
	
	public static void main(String[] args) {
		AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent test = new AGT248_ParameterInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}

}
