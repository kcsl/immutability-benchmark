package testcase;

import annotations.READONLY;

public class AGT057_LongLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT057_LongLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT057_LongLiteral_Parameter test = new AGT057_LongLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = 1L;
	}

}
