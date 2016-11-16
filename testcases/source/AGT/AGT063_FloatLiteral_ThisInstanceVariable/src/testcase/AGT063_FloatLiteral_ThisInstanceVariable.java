package testcase;

import annotations.MUTABLE;

public class AGT063_FloatLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT063_FloatLiteral_ThisInstanceVariable test = new AGT063_FloatLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT063_FloatLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = 1.0F;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}