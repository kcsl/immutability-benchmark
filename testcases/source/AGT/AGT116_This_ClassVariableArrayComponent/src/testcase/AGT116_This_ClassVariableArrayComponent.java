package testcase;

import annotations.MUTABLE;

public class AGT116_This_ClassVariableArrayComponent {

	@MUTABLE
	public static Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		// modified toString to avoid recursive stackoverflow
		String result = "AGT116_This_ClassVariableArrayComponent [f=";
		String prefix = "";
		for(Object o : f){
			result += prefix + o.hashCode();
			prefix = ", ";
		}
		result +=  "]";
		return result;
	}

	public static void main(String[] args) {
		AGT116_This_ClassVariableArrayComponent a = new AGT116_This_ClassVariableArrayComponent();
		a.foo();
	}
	
	public void foo(){
		AGT116_This_ClassVariableArrayComponent b = new AGT116_This_ClassVariableArrayComponent();
		System.out.println(b.toString());
		AGT116_This_ClassVariableArrayComponent.f[0] = this;
		System.out.println(b.toString());
	}

}
