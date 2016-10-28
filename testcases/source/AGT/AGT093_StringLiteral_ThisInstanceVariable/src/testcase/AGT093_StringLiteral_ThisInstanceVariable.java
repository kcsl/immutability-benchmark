package testcase;

import annotations.MUTABLE;

public class AGT093_StringLiteral_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT093_StringLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = "1";
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT093_StringLiteral_ThisInstanceVariable test = new AGT093_StringLiteral_ThisInstanceVariable();
		test.foo();
	}

}
