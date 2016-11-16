package testcase;

import annotations.MUTABLE;

public class AGT033_ShortLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT033_ShortLiteral_ThisInstanceVariable test = new AGT033_ShortLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT033_ShortLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = (short) 1;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}