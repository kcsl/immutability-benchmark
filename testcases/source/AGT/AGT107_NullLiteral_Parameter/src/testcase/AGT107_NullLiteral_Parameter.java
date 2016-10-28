package testcase;

import annotations.READONLY;

public class AGT107_NullLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT107_NullLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT107_NullLiteral_Parameter test = new AGT107_NullLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = null;
	}

}
