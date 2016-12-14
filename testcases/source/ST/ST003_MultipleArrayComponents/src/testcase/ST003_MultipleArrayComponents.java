package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class ST003_MultipleArrayComponents {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new ST003_MultipleArrayComponents().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.f[0] = new Object();
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object(), new Object() };

	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}