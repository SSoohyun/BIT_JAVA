package ex1101;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 과제 1 */
		/*
		System.out.print("구구단의 시작단 입력 --> ");
		int start = scan.nextInt(); 
		System.out.print("구구단의 끝단 입력 --> ");
		int end = scan.nextInt(); 
		
		if(start <= end) {
			for(int i=1; i<10; i++, System.out.println()) {
				for (int dan=start; dan<=end; dan++) {
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
				}
			}
		} else {
			for(int i=1; i<10; i++, System.out.println()) {
				for (int dan=start; dan>=end; dan--) {
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
				}
			}
		}
		*/
		
		
		/* 과제 2 */
		System.out.print("정수를 입력하세요 >> ");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++, System.out.println()) {
			for(int j=1; j<=i; j++) {
				System.out.print(' ');
				System.out.print(i);
			}
		}
		
			
		/*
		 * 과제 3
		 * 무한 반복으로 사칙연산을 계산하는 프로그램 
		 * 나누기는 소수점 첫째자리까지 출력
		 * quit을 입력하면 프로그램 종료
		 */
		/*
		boolean exec = true;
		while(exec) {
			System.out.print("첫 번째 숫자 입력: ");
			int num1 = scan.nextInt();
			System.out.print("두 번째 숫자 입력: ");
			int num2 = scan.nextInt();
			System.out.print("연산 기호 입력: ");
			String oper = scan.next();
			double result = 0;
			switch(oper) {
			case "+":
				result = num1 + num2;
				System.out.printf("계산 결과는 %.0f\n", result);
				break;
			case "-":
				result = num1 - num2;
				System.out.printf("계산 결과는 %.0f\n", result);
				break;
			case "*":
				result = num1 * num2;
				System.out.printf("계산 결과는 %.0f\n", result);
				break;
			case "/":
				result = num1 / num2;
				System.out.printf("계산 결과는 %.1f\n", result);
				break;
			case "quit":
				exec = false;
			}
		}
		*/
		
		/* 과제 4 */
//		System.out.println("2자리의 정수를 입력하세요.");
//		System.out.print("입력 >> ");
//		int number = scan.nextInt();
//		while(true) {
//			System.out.print("입력 >> ");
//			number = scan.nextInt();
//			if(number>=10 && number <=99) {
//				System.out.printf("입력받은 정수의 값은 %d임\n", number);
//				break;
//			}
//		}
		
		
		
		/* 과제 5 */
//		int i = 1;
//		while(true) {
//			int width = 1;
//			int height = 1;
//			
//			width = 2*i;
//			height = 3*i;
//			
//			double tri = 0.5*width*height;
//			if(tri > 150) {
//				break;
//			}
//			System.out.printf("삼각형의 넓이: %.1f\n", tri);
//			i++;
//		}
		
		
		
	}

}
