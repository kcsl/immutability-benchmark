package testcase;

import annotations.MUTABLE;

public class AGT049_IntLiteral_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT049_IntLiteral_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT049_IntLiteral_ParameterInstanceVariable test = new AGT049_IntLiteral_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT049_IntLiteral_ParameterInstanceVariable p){
		p.f = (int) 1;
	}

}
