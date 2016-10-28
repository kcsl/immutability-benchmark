package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public enum AGT124_Enum_ThisInstanceVariableArrayComponent {

	A,B;
	
	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT124_Enum_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = AGT124_Enum_ThisInstanceVariableArrayComponent.B;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT124_Enum_ThisInstanceVariableArrayComponent test = AGT124_Enum_ThisInstanceVariableArrayComponent.A;
		test.foo();
	}

}
