package testcase;
public class ST005_DynamicDispatches {
	public static Test test = new B();
	public static void main(String[] args){
		System.out.println(test);
		test.foo(); // B.foo mutates test
		System.out.println(test);
	}
}

class Test {
	protected Object f = new Object();
	public void foo(){} // no mutations
	@Override
	public String toString() {
		return "Test [f=" + f + "]";
	}
}

class A extends Test {
	@Override
	public void foo(){} // no mutations
}

class B extends Test {
	@Override
	public void foo(){
		this.f = new Object(); // mutates 'this'
	}
}