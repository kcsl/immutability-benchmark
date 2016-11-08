package testcase;

import annotations.MUTABLE;

public class AGT120_This_ParameterInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT120_This_ParameterInstanceVariableArrayComponent [f=";
		String prefix = "";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]";
		return result;
	}
	
	public static void main(String[] args) {
		AGT120_This_ParameterInstanceVariableArrayComponent test = new AGT120_This_ParameterInstanceVariableArrayComponent();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT120_This_ParameterInstanceVariableArrayComponent p){
		p.f[0] = this;
	}

}
