package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT170_ThisInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT170_ThisInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT170_ThisInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent a = new AGT170_ThisInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT170_ThisInstanceVariableArrayComponent_ParameterInstanceVariableArrayComponent p){
		p.f1[0] = this.f2[0];
	}

}
