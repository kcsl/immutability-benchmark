package testcase;

import annotations.READONLY;

public enum AGT127_Enum_Parameter {

	A,B;
	
	@READONLY
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT127_Enum_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT127_Enum_Parameter test = AGT127_Enum_Parameter.A;
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object p){
		p = AGT127_Enum_Parameter.B;
	}

}
