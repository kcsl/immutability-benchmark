package testcase;

import annotations.READONLY;

public class AGT007_FinalObject_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT007_FinalObject_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT007_FinalObject_Parameter test = new AGT007_FinalObject_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		final Object o = new Object();
		p = o;
	}

}
