package ex1102;

import java.util.Scanner;

public class IncrementEx {
/*
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메소드 호출 전의 x:" + x);
		increment(x); // x는 argument(인자)
		System.out.println("increment() 메소드 호출 후의 x:" + x);

	}
	
	// 기본형: 기본형 매개변수 --> 값 복사되고 독립적
	public static void increment(int n) { // n은 매개변수
		System.out.println("increment() 메소드 시작 시의 n:" + n);
		n++;
		System.out.println("increment() 메소드 종료 시의 n:" + n);
	}
	*/
	
	
	
	/*
	 * 연습문제 
	 * 2개의 정수를 입력받아 사칙연산을 수행하는 메소드 작성하고, 그것을 실행하는 프로그램
	 * 메인 메소드에서 호출하여 실행 확인
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하세요 >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.printf("%d와 %d의 합은 %d\n", num1, num2, add(num1, num2));
		System.out.printf("%d와 %d의 차는 %d\n", num1, num2, minus(num1, num2));
		System.out.printf("%d와 %d의 곱은 %d\n", num1, num2, multi(num1, num2));
		System.out.printf("%d 나누기 %d은 %.16f\n", num1, num2, divide(num1, num2));
	}
	
	public static int add(int i, int j) {
		return i+j;
	}
	
	public static int minus(int i, int j) {
		return i-j;
	}
	
	public static int multi(int i, int j) {
		return i*j;
	}
	
	public static double divide(int i, int j) {
		return (double)i/(double)j;
	}
}
