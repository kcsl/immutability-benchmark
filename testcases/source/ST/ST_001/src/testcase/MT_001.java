package testcase;

import annotations.MUTABLE;

public class MT_001 {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object[]{ new Object() } };
	
	@Override
	public String toString() {
		return "MT_001 [f1=" + f1 + "]";
	}
	
	public static void main(String[] args) {
		MT_001 test = new MT_001();
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}
	
	public void bar(MT_001 p){
		p.f1 = (Object[]) f1[0];
	}

}
