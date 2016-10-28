package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT220_Parameter_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT220_Parameter_ClassVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public void foo(Object p){
		AGT220_Parameter_ClassVariableArrayComponent.f1[0] = p;
	}
	
	public static void main(String[] args) {
		AGT220_Parameter_ClassVariableArrayComponent test = new AGT220_Parameter_ClassVariableArrayComponent();
		System.out.println(test);
		test.foo(test.f2);
		System.out.println(test);
	}

}
