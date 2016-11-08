package testcase;

import annotations.MUTABLE;

public class MT_002 {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		// using hashcode to avoid a recursive stackoverflow
		return "MT_002 [f=" + f.hashCode() + "]"; 
	}
	
	public MT_002 getThis(){
		return this;
	}
	
	public static void main(String[] args) {
		MT_002 test = new MT_002();
		System.out.println(test);
		test.f = test.getThis();
		System.out.println(test);
	}

}