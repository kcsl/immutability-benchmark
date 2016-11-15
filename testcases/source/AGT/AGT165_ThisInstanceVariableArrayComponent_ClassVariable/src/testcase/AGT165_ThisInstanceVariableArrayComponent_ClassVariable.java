package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT165_ThisInstanceVariableArrayComponent_ClassVariable {

	@READONLY
	public static Object f1 = new Object();
	
	@READONLY
	public Object[] f2 = new Object[]{ new Object() };

	@Override
	public String toString() {
		assert(f1 instanceof Object); // Object types are immutable
		return "AGT165_ThisInstanceVariableArrayComponent_ClassVariable [f1=IMMUTABLE" + ", f2=" + Arrays.toString(f2) + "]";
	}
	
	public static void main(String[] args) {
		AGT165_ThisInstanceVariableArrayComponent_ClassVariable a = new AGT165_ThisInstanceVariableArrayComponent_ClassVariable ();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT165_ThisInstanceVariableArrayComponent_ClassVariable.f1 = this.f2[0];
	}

}
