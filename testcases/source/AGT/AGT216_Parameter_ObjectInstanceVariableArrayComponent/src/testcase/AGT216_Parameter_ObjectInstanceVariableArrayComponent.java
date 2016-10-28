package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT216_Parameter_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT216_Parameter_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public void foo(Object p){
		AGT216_Parameter_ObjectInstanceVariableArrayComponent b = new AGT216_Parameter_ObjectInstanceVariableArrayComponent();
		b.f[0] = p;
	}
	
	public static void main(String[] args) {
		AGT216_Parameter_ObjectInstanceVariableArrayComponent a = new AGT216_Parameter_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo(a.f);
		System.out.println(a);
	}

}
