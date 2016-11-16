package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT104_NullLiteral_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public static AGT104_NullLiteral_ThisInstanceVariableArrayComponent test = new AGT104_NullLiteral_ThisInstanceVariableArrayComponent();
	
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT104_NullLiteral_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = null;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		test.foo();
	}

}