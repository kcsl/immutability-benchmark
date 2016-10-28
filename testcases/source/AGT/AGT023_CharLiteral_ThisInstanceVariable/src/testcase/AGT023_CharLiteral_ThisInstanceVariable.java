package testcase;

import annotations.MUTABLE;

public class AGT023_CharLiteral_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT023_CharLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = '1';
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT023_CharLiteral_ThisInstanceVariable test = new AGT023_CharLiteral_ThisInstanceVariable();
		test.foo();
	}

}
