package testcase;

import annotations.MUTABLE;

public enum AGT123_Enum_ThisInstanceVariable {

	E;
	
	@MUTABLE
	public static AGT123_Enum_ThisInstanceVariable test = AGT123_Enum_ThisInstanceVariable.E;
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT123_Enum_ThisInstanceVariable [f=" + f.hashCode() + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = AGT123_Enum_ThisInstanceVariable.E;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}