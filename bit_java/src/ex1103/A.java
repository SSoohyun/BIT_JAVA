package ex1103;

public class A {
	static int a = 40;
	public static int add(int x, int y) {
		return a+y;
	}
	
	// 메인 메소드: static 메소드
	public static void main(String[] args) {
		// 객체 생성 후 출력
		A aa = new A();
		System.out.println(aa.a);
		
		// static으로 선언했을 때
		System.out.println(a);
		
		add(1, 2);
	
	}

}
