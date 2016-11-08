package testcase;

import annotations.MUTABLE;

public class AGT114_This_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT114_This_ThisInstanceVariableArrayComponent [f=";
		String prefix = "";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]";
		return result;
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = this;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT114_This_ThisInstanceVariableArrayComponent test = new AGT114_This_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
