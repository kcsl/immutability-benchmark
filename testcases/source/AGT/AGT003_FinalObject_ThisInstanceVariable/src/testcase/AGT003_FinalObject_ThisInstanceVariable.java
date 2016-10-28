package testcase;

import annotations.MUTABLE;

public class AGT003_FinalObject_ThisInstanceVariable {

	@MUTABLE
	public Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT003_FinalObject_ThisInstanceVariable [f=" + f + "]";
	}

	public void foo(){
		final Object o2 = new Object();
		System.out.println(this.toString());
		this.f = o2;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT003_FinalObject_ThisInstanceVariable test = new AGT003_FinalObject_ThisInstanceVariable();
		test.foo();
	}

}
