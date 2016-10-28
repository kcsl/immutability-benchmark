package testcase;

import annotations.READONLY;

public class AGT147_ObjectInstanceVariableArrayComponent_Parameter {

	@READONLY
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT147_ObjectInstanceVariableArrayComponent_Parameter [f=" + f + "]";
	}
	
	public static void main(String[] args) {
		AGT147_ObjectInstanceVariableArrayComponent_Parameter a = new AGT147_ObjectInstanceVariableArrayComponent_Parameter();
		System.out.println(a);
		a.foo(a.f);
		System.out.println(a);
	}
	
	public void foo(Object p){
		AGT147_ObjectInstanceVariableArrayComponent_Parameter b = new AGT147_ObjectInstanceVariableArrayComponent_Parameter();
		p = b.f[0];
	}

}
