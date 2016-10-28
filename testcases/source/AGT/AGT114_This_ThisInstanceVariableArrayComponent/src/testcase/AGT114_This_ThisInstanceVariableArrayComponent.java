package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT114_This_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT114_This_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = this;
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT114_This_ThisInstanceVariableArrayComponent test = new AGT114_This_ThisInstanceVariableArrayComponent();
		test.foo();
	}

}
