package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT226_ParameterArrayComponent_ObjectInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(new Object[]{ new Object() });
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object[] p){
		Test o = new Test();
		o.f[0] = p[0];
	}
	
	@Override
	public String toString() {
		return "Test [f=" + Arrays.toString(f) + "]";
	}
}