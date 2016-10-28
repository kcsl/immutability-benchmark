package testcase;

import annotations.MUTABLE;

public enum AGT123_Enum_ThisInstanceVariable {

	A,B;
	
	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT123_Enum_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = AGT123_Enum_ThisInstanceVariable.B;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT123_Enum_ThisInstanceVariable test = AGT123_Enum_ThisInstanceVariable.A;
		test.foo();
	}

}
