package testcase;

import annotations.MUTABLE;

public enum AGT124_Enum_ThisInstanceVariableArrayComponent {

	E;
	
	@MUTABLE
	public static AGT124_Enum_ThisInstanceVariableArrayComponent test = AGT124_Enum_ThisInstanceVariableArrayComponent.E;
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT124_Enum_ThisInstanceVariableArrayComponent [f=";
		String prefix = "[";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]]";
		return result;
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = AGT124_Enum_ThisInstanceVariableArrayComponent.E;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}