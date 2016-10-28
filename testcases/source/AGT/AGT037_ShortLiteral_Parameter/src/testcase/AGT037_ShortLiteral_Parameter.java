package testcase;

import annotations.READONLY;

public class AGT037_ShortLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT037_ShortLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT037_ShortLiteral_Parameter test = new AGT037_ShortLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = (short) 1;
	}

}
