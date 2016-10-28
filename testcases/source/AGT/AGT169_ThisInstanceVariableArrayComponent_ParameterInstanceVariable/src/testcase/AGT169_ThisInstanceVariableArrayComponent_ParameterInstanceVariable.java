package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT169_ThisInstanceVariableArrayComponent_ParameterInstanceVariable {

	@MUTABLE
	public Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT169_ThisInstanceVariableArrayComponent_ParameterInstanceVariable [f1=" + f1 + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT169_ThisInstanceVariableArrayComponent_ParameterInstanceVariable a = new AGT169_ThisInstanceVariableArrayComponent_ParameterInstanceVariable();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT169_ThisInstanceVariableArrayComponent_ParameterInstanceVariable p){
		p.f1 = this.f2[0];
	}

}
