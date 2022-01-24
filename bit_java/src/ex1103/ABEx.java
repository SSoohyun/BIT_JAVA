package ex1103;

class A {
	public int p;
	private int n; // 클래스 A내에서만 보임
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
} // A의 끝

class B extends A {	

	private int m; // 클래스 B내에서만 보임
	
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
		// 객체 생성
		A a = new A();
		B b = new B();
		
		// 값 지정
		a.p = 5;
//		a.n = 5; // n은 private member
		b.p = 5;
//		b.n = 5; // n은 private member
		// setter를 호출하여 n값을 10으로 변경
		b.setN(10);
		int i = b.getN();
//		b.m = 20; // n은 private member
		b.setM(20);
		
		// 출력
		System.out.println(b.toString());
	}
	
}