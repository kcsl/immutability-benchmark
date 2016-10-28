package testcase;

import annotations.MUTABLE;

public class M1 {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object[]{ new Object() } };
	
	@Override
	public String toString() {
		return "M1 [f1=" + f1 + "]";
	}
	
	public static void main(String[] args) {
		M1 test = new M1();
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}
	
	public void bar(M1 p){
		p.f1 = (Object[]) f1[0];
	}

}
