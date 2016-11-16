package testcase;

import annotations.MUTABLE;

public class AGT103_NullLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT103_NullLiteral_ThisInstanceVariable test = new AGT103_NullLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT103_NullLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = null;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}