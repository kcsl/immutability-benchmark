package testcase;

import java.util.Arrays;

import annotations.MUTABLE;

public class AGT192_Return_ObjectInstanceVariableArrayComponent {

	@MUTABLE
	public Object[] f = new Object[]{ new Object() };

	@Override
	public String toString() {
		return "AGT192_Return_ObjectInstanceVariableArrayComponent [f=" + Arrays.toString(f) + "]";
	}
	
	public static void main(String[] args){
		AGT192_Return_ObjectInstanceVariableArrayComponent test = new AGT192_Return_ObjectInstanceVariableArrayComponent();
		System.out.println(test);
		test.f[0] = bar();
		System.out.println(test);
	}
	
	public static Object bar(){
		return new Object();
	}
	
}
