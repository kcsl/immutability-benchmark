package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT222_ParameterArrayComponent_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT222_ParameterArrayComponent_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f, new Object[]{ new Object() });
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object[] p1, Object[] p2){
		p1[0] = p2[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}