package ex1103;

class A {
	public int p;
	private int n; // Ŭ���� A�������� ����
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
} // A�� ��

class B extends A {	

	private int m; // Ŭ���� B�������� ����
	
	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}
	
	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}	
}

public class ABEx {
	
	public static void main(String[] args) {
		// ��ü ����
		A a = new A();
		B b = new B();
		
		// �� ����
		a.p = 5;
//		a.n = 5; // n�� private member
		b.p = 5;
//		b.n = 5; // n�� private member
		// setter�� ȣ���Ͽ� n���� 10���� ����
		b.setN(10);
		int i = b.getN();
//		b.m = 20; // n�� private member
		b.setM(20);
		
		// ���
		System.out.println(b.toString());
	}
	
}