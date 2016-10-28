package testcase;

import annotations.READONLY;

public class AGT117_This_Parameter {

	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT117_This_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT117_This_Parameter test = new AGT117_This_Parameter();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = this;
	}

}
