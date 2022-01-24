package ex1103;

// 자식 생성자 호출 --> 부모 생성자가 먼저 실행된 후에 자식 생성자 실행
// 자식 객체가 생기려면 부모 객체가 먼저 만들어져야 함
class A {
	public A() {
		System.out.println("A객체 생성");
	}
}

class B extends A {
	public B() {
		System.out.println("B객체 생성");
	}
}

class C extends B {
	public C() {
		System.out.println("C객체 생성");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		C c;
		c = new C();
	}

}
