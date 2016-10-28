package testcase;

import annotations.READONLY;

public class AGT077_DoubleLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT077_DoubleLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT077_DoubleLiteral_Parameter test = new AGT077_DoubleLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = 1.0;
	}

}
