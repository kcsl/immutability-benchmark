package testcase;

import annotations.MUTABLE;

public class AGT195_Return_ClassVariable {

	@MUTABLE
	public static Object f = new Object();
	
	@Override
	public String toString() {
		return "AGT195_Return_ClassVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT195_Return_ClassVariable test = new AGT195_Return_ClassVariable();
		System.out.println(test.toString());
		AGT195_Return_ClassVariable.f = bar();
		System.out.println(test.toString());
	}
	
	public static Object bar(){
		return new Object();
	}

}
