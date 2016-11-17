package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT216_Parameter_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT216_Parameter_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object p){
		Test test2 = new Test();
		test2.f[0] = p;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}