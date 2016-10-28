package testcase;

import annotations.MUTABLE;

public class AGT043_IntLiteral_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT043_IntLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = (int) 1;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT043_IntLiteral_ThisInstanceVariable test = new AGT043_IntLiteral_ThisInstanceVariable();
		test.foo();
	}

}
