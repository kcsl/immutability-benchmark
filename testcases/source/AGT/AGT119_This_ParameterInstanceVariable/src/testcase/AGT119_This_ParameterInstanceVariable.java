package testcase;

import annotations.MUTABLE;

public class AGT119_This_ParameterInstanceVariable {

	@MUTABLE
	public Object f = new Object();

	@Override
	public String toString() {
		return "AGT119_This_ParameterInstanceVariable [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT119_This_ParameterInstanceVariable test = new AGT119_This_ParameterInstanceVariable();
		System.out.println(test);
		test.foo(test);
		System.out.println(test);
	}
	
	public void foo(AGT119_This_ParameterInstanceVariable p){
		p.f = this;
	}

}
