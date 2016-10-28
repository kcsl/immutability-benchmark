package testcase;

import java.util.Arrays;

import annotations.READONLY;

public class AGT112_This_ObjectInstanceVariableArrayComponent {

	@READONLY
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT112_This_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public static void main(String[] args){
		AGT112_This_ObjectInstanceVariableArrayComponent a = new AGT112_This_ObjectInstanceVariableArrayComponent();
		System.out.println(a);
		a.foo();
		System.out.println(a);
	}
	
	public void foo(){
		AGT112_This_ObjectInstanceVariableArrayComponent b = new AGT112_This_ObjectInstanceVariableArrayComponent();
		b.f[0] = this;
	}
	
}
