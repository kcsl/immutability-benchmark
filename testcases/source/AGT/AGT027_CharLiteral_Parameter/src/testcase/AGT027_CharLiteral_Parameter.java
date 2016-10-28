package testcase;

import annotations.READONLY;

public class AGT027_CharLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT027_CharLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT027_CharLiteral_Parameter test = new AGT027_CharLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = '1';
	}

}
