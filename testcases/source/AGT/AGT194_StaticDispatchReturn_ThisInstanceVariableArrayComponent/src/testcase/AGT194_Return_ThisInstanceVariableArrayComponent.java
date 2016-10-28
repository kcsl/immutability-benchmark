package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT194_Return_ThisInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };
	
	@Override
	public String toString() {
		return "AGT194_Return_ThisInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}

	public void foo(){
		System.out.println(this.toString());
		this.f[0] = bar();
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		AGT194_Return_ThisInstanceVariableArrayComponent test = new AGT194_Return_ThisInstanceVariableArrayComponent();
		test.foo();
	}
	
	public static Object bar(){
		return new Object();
	}

}
