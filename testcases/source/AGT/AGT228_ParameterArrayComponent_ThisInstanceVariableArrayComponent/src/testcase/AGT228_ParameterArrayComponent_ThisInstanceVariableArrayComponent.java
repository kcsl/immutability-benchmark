package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public void foo(Object[] p){
		this.f1[0] = p[0];
	}
	
	public static void main(String[] args) {
		AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent test = new AGT228_ParameterArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
