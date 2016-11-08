package testcase;

import annotations.MUTABLE;

public class AGT118_This_ParameterArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT118_This_ParameterArrayComponent [f=";
		String prefix = "";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]";
		return result;
	}
	
	public static void main(String[] args) {
		AGT118_This_ParameterArrayComponent test = new AGT118_This_ParameterArrayComponent();
		System.out.println(test);
		test.foo(test.f);
		System.out.println(test);
	}
	
	public void foo(Object[] p){
		p[0] = this;
	}

}
