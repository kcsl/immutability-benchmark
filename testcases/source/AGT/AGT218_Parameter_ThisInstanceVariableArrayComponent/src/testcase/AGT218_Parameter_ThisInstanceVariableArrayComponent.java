package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT218_Parameter_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT218_Parameter_ThisInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object());
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object p){
		this.f[0] = p;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}