package testcase;

import annotations.READONLY;

public class AGT087_BooleanLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT087_BooleanLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT087_BooleanLiteral_Parameter test = new AGT087_BooleanLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = true;
	}

}
