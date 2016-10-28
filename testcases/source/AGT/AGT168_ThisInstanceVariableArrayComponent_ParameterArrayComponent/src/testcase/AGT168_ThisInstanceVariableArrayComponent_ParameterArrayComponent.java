package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent {
	
	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };

	@READONLY
	public Object[] f2 = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent a = new AGT168_ThisInstanceVariableArrayComponent_ParameterArrayComponent ();
		System.out.println(a);
		a.foo(a.f1);
		System.out.println(a);
	}
	
	public void foo(Object[] p){
		p[0] = this.f2[0];
	}

}
