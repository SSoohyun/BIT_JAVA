package ex1103;

// �ڽ� ������ ȣ�� --> �θ� �����ڰ� ���� ����� �Ŀ� �ڽ� ������ ����
// �ڽ� ��ü�� ������� �θ� ��ü�� ���� ��������� ��
class A {
	public A() {
		System.out.println("A��ü ����");
	}
}

class B extends A {
	public B() {
		System.out.println("B��ü ����");
	}
}

class C extends B {
	public C() {
		System.out.println("C��ü ����");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		C c;
		c = new C();
	}

}
