package ex1101;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
//		for(int i=0 /* 초기식 */; i<2 /* 반복 횟수만큼 참으로 만들어줄 조건 */; i++ /* 실행문을 실행한 후 할 일 */) {
//			System.out.println("hello world"); // 반복해야 할 일
//		}
		
		/*
		 * for(int i=0; i<100; i++) { System.out.println((i+1) + ": hello world"); }
		 */
		
		
		// 예제
		/*
		int sum = 0;
		for(int i=1; i<=10; i++, System.out.println(i)) { // i+=2하면 홀수의 합
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum);
		
		
		int dan = 3;
		for(int i=1; i<10; i++) { // for문 시작
			System.out.println(dan + " * " + i + " = " + dan*i);
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		} // for문 끝
		*/
		
		// 예제
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			}
//		}
		
		
		// 연습문제
		// 구구단을 가로로 출력
//		for(int i=1; i<10; i++, System.out.println()) {
//			for(int dan=2; dan<10; dan++) {
//				System.out.printf("%d * %d = %d\t", dan, i, dan*i);
//			}
//		}
		
		
		
		
		/* while */
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합은 " + sum);
		
		
		// 예제
		int num = 1;
		int minNum = 0;
		while(num <= 100) {
			if(num%3==0 && num%8==0) {
				System.out.printf("공배수: %d\n", num);
				if(minNum == 0) {
					minNum = num;
				}
			}
			num++;
		}
		System.out.printf("최소공배수: %d", minNum);
	
		
		
		/*
		 * 연습문제 
		 * 무한 반복으로 사칙연산을 계산하는 프로그램 
		 * 나누기는 소수점 첫째자리까지 출력
		 */
		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("첫 번째 숫자 입력: ");
//			int num1 = scan.nextInt();
//			System.out.print("두 번째 숫자 입력: ");
//			int num2 = scan.nextInt();
//			System.out.print("연산 기호 입력: ");
//			String oper = scan.next();
//			double result = 0;
//			switch(oper) {
//			case "+":
//				result = num1 + num2;
//				System.out.printf("계산 결과는 %.0f\n", result);
//				break;
//			case "-":
//				result = num1 - num2;
//				System.out.printf("계산 결과는 %.0f\n", result);
//				break;
//			case "*":
//				result = num1 * num2;
//				System.out.printf("계산 결과는 %.0f\n", result);
//				break;
//			case "/":
//				result = num1 / num2;
//				System.out.printf("계산 결과는 %.1f\n", result);
//				break;
//			}
//		}
		
		/*
		 * 연습문제 
		 * 버스 1회당 사용요금은 1250원으로 카드를 사용할 때마다 사용횟수와 사용 후 잔액을 출력 
		 * 최초 금액을 출력한 다음, 사용횟수와 함께 잔액을 출력 
		 * 잔액이 부족하면 출력 종료
		 */
//		System.out.print("최초 충전금액 -->> ");
//		int money = scan.nextInt();
//		System.out.printf("%d원이 충전되었음\n", money);
//		int cnt = 1;
//		while(money >= 1250) {
//			money -= 1250;
//			System.out.printf("%d회 사용한 후 현재 잔액은 %d원\n", cnt, money);
//			cnt++;
//		}
		
		
		// do~while
//		int i = 1;
//		int sum = 0;
//		do {
//			sum += i;
//			i++;
//		} while(i <= 10);
//		System.out.println("1부터 10까지의 합은 " + sum);
		
		
		// 예제
//		int sum = 0;
//		for(int i=0; i<=100; i++) {
//			if(i%2 == 1) {
//				continue;
//			} else {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
	}

}
