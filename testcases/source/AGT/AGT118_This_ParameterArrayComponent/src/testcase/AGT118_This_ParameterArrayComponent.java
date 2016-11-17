package testcase;

import annotations.MUTABLE;

public class AGT118_This_ParameterArrayComponent {

	@MUTABLE
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT118_This_ParameterArrayComponent().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test.f);
		System.out.println(test);
	}

}

class Test {
	public Object[] f = new Object[]{ new Object() };
	
	public void bar(Object[] p){
		p[0] = this;
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