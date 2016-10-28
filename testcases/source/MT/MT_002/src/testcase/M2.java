package testcase;

import annotations.MUTABLE;

public class M2 {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		// using hashcode to avoid a recursive stackoverflow
		return "M2 [f=" + f.hashCode() + "]"; 
	}
	
	public M2 getThis(){
		return this;
	}
	
	public static void main(String[] args) {
		M2 test = new M2();
		System.out.println(test);
		test.f = test.getThis();
		System.out.println(test);
	}

}