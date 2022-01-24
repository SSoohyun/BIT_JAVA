package hw1101;

import java.util.Scanner;

public class Hw03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		
		scan.close();
	}
	
}
