package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT180_ClassVariable_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public static Object f2 = new Object();
	
	@Override
	public String toString() {
		return "AGT180_ClassVariable_ParameterInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public static void main(String[] args) {
		AGT180_ClassVariable_ParameterInstanceVariableArrayComponent a = new AGT180_ClassVariable_ParameterInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a);
		System.out.println(a);
	}
	
	public void foo(AGT180_ClassVariable_ParameterInstanceVariableArrayComponent p){
		p.f1[0] = AGT180_ClassVariable_ParameterInstanceVariableArrayComponent.f2;
	}

}
