package testcase;

import annotations.MUTABLE;

public class AGT083_BooleanLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT083_BooleanLiteral_ThisInstanceVariable test = new AGT083_BooleanLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT083_BooleanLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = true;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}