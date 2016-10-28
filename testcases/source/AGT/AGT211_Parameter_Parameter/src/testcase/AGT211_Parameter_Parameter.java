package testcase;

import annotations.READONLY;

public class AGT211_Parameter_Parameter {

	@READONLY
	public Object f1 = new Object();
	
	@READONLY
	public Object f2 = new Object();

	@Override
	public String toString() {
		return "AGT211_Parameter_Parameter [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	public void foo(Object p1, Object p2){
		p1 = p2;
	}
	
	public static void main(String[] args) {
		AGT211_Parameter_Parameter test = new AGT211_Parameter_Parameter();
		System.out.println(test);
		test.foo(test.f1, test.f2);
		System.out.println(test);
	}

}
