package testcase;

import annotations.READONLY;

public class AGT067_FloatLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT067_FloatLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT067_FloatLiteral_Parameter test = new AGT067_FloatLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = 1.0F;
	}

}
