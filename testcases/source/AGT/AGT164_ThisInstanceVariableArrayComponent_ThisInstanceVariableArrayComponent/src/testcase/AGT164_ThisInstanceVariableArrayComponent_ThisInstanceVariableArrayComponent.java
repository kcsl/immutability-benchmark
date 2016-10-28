package testcase;

import java.util.Arrays;

import annotations.MUTABLE;
import annotations.READONLY;

public class AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f1 = new Object[]{ new Object() };
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent [f1=" + Arrays.toString(f1) + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent a = new AGT164_ThisInstanceVariableArrayComponent_ThisInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		this.f1[0] = this.f2[0];
	}

}
