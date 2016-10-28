package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT218_Parameter_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT218_Parameter_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public void foo(Object p){
		this.f[0] = p;
	}
	
	public static void main(String[] args) {
		AGT218_Parameter_ThisInstanceVariableArrayComponent test = new AGT218_Parameter_ThisInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}

}
