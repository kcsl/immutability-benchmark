package testcase;

import annotations.READONLY;

public class AGT017_ByteLiteral_Parameter {

	@READONLY
	public Test test = new Test();
	
	public static void main(String[] args) {
		new AGT017_ByteLiteral_Parameter().foo();
	}
	
	public void foo(){
		System.out.println(test);
		test.bar(test);
		System.out.println(test);
	}

}

class Test {
	public Object f = new Object();
	
	public void bar(Object p){
		p = (byte) 0x01;
	}
	
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}