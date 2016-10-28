package testcase;

import annotations.MUTABLE;

public enum AGT126_Enum_ClassVariableArrayComponent {

	A,B;
	
	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT126_Enum_ClassVariableArrayComponent [f=";
		String prefix = "";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]";
		return result;
	}
	
	public static void main(String[] args) {
		AGT126_Enum_ClassVariableArrayComponent test = AGT126_Enum_ClassVariableArrayComponent.A;
		System.out.println(test.toString());
		AGT126_Enum_ClassVariableArrayComponent.f[0] = AGT126_Enum_ClassVariableArrayComponent.B;
		System.out.println(test.toString());
	}

}
