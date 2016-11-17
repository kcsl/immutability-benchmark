package testcase;

import annotations.MUTABLE;

public class AGT120_This_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT120_This_ParameterInstanceVariableArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Test p){
		p.f[0] = this;
	}
	
	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "Test [f=";
		String prefix = "[";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]]";
		return result;
	}
}