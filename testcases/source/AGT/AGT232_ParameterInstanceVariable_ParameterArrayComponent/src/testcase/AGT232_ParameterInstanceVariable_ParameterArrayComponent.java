package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT232_ParameterInstanceVariable_ParameterArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT232_ParameterInstanceVariable_ParameterArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + f2 + "]";
	}
	
	public void foo(Object[] p1, AGT232_ParameterInstanceVariable_ParameterArrayComponent p2){
		p1[0] = p2.f2;
	}
	
	public static void main(String[] args) {
		AGT232_ParameterInstanceVariable_ParameterArrayComponent test = new AGT232_ParameterInstanceVariable_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f1, test);
		System.out.println(test);
	}

}
