package aaa;

class A {
//	int def; // default
//	protected int pro;
//	private int pri;
//	public int pub;
	
	
	public A() {
		System.out.println("A��ü ����");
	}
	
	
	public A(int x) {
		System.out.println("�Ű����� �ִ� ������ A��ü ����");
	}
	
} // A�� ��

class B extends A {
	public B() {
		System.out.println("B��ü ����");
	}
	
	public B(int y) {
		// super(); // �����Ǿ�����
		super(y);
		System.out.println("�Ű����� �ִ� ������ B��ü ����");
	}
	
}
public class ConstructorEx {
	public static void main(String[] args) {
		B b;
		b = new B(3);
	}
}