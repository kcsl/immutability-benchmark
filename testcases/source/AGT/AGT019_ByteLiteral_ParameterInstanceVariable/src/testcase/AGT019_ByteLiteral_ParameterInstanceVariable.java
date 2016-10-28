package testcase;

import annotations.MUTABLE;

public class AGT019_ByteLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT019_ByteLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT019_ByteLiteral_ParameterInstanceVariable test = new AGT019_ByteLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT019_ByteLiteral_ParameterInstanceVariable p){
		p.f = (byte) 0x01;
	}

}
