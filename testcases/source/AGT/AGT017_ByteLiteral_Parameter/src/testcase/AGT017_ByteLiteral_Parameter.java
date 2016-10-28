package testcase;

import annotations.READONLY;

public class AGT017_ByteLiteral_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT017_ByteLiteral_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT017_ByteLiteral_Parameter test = new AGT017_ByteLiteral_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = (byte) 0x01;
	}

}
