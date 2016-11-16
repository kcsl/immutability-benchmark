package testcase;

import annotations.MUTABLE;

public class AGT073_DoubleLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT073_DoubleLiteral_ThisInstanceVariable test = new AGT073_DoubleLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT073_DoubleLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = 1.0;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}