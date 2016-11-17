package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT167_ThisInstanceVariableArrayComponent_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT167_ThisInstanceVariableArrayComponent_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object p){
		p = this.f[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}