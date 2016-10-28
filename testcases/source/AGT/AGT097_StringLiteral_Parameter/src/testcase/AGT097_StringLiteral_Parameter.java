package testcase;

import annotations.READONLY;

public class AGT097_StringLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT097_StringLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT097_StringLiteral_Parameter test = new AGT097_StringLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = "1";
	}

}
