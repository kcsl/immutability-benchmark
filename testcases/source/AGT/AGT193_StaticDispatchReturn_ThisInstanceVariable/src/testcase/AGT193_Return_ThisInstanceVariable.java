package testcase;

import annotations.MUTABLE;

public class AGT193_Return_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT193_Return_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f = bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT193_Return_ThisInstanceVariable test = new AGT193_Return_ThisInstanceVariable();
		test.foo();
	}
	
	public static Object bar(){
		return new Object();
	}

}
