package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT018_ByteLiteral_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT018_ByteLiteral_ParameterArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args) {
		AGT018_ByteLiteral_ParameterArrayComponent test = new AGT018_ByteLiteral_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = (byte) 0x01;
	}

}
