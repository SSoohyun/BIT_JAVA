package ex1103;

public class A {
	static int a = 40;
	public static int add(int x, int y) {
		return a+y;
	}
	
	// ���� �޼ҵ�: static �޼ҵ�
	public static void main(String[] args) {
		// ��ü ���� �� ���
		A aa = new A();
		System.out.println(aa.a);
		
		// static���� �������� ��
		System.out.println(a);
		
		add(1, 2);
	
	}

}
