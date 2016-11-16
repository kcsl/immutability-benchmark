package testcase;

import annotations.MUTABLE;

public class AGT013_ByteLiteral_ThisInstanceVariable {

	@MUTABLE
	public static AGT013_ByteLiteral_ThisInstanceVariable test = new AGT013_ByteLiteral_ThisInstanceVariable();
	
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT013_ByteLiteral_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = (byte) 0x01;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}