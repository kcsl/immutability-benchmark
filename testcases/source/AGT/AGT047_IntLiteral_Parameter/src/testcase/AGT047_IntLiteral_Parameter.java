package testcase;

import annotations.READONLY;

public class AGT047_IntLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT047_IntLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT047_IntLiteral_Parameter test = new AGT047_IntLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = (int) 1;
	}

}
