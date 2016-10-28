package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT159_ThisInstanceVariable_ParameterInstanceVariable [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent a = new AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT160_ThisInstanceVariable_ParameterInstanceVariableArrayComponent p){
		p.f1[0] = this.f2;
	}

}
