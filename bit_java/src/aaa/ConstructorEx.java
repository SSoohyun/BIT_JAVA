package aaa;

class A {
//	int def; // default
//	protected int pro;
//	private int pri;
//	public int pub;
	
	
	public A() {
		System.out.println("A객체 생성");
	}
	
	
	public A(int x) {
		System.out.println("매개변수 있는 생성자 A객체 생성");
	}
	
} // A의 끝

class B extends A {
	public B() {
		System.out.println("B객체 생성");
	}
	
	public B(int y) {
		// super(); // 생략되어있음
		super(y);
		System.out.println("매개변수 있는 생성자 B객체 생성");
	}
	
}
public class ConstructorEx {
	public static void main(String[] args) {
		B b;
		b = new B(3);
	}
}