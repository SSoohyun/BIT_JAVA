package hw1101;

import java.util.Scanner;

public class Hw03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exec = true;
		while(exec) {
			System.out.print("ù ��° ���� �Է�: ");
			int num1 = scan.nextInt();
			System.out.print("�� ��° ���� �Է�: ");
			int num2 = scan.nextInt();
			System.out.print("���� ��ȣ �Է�: ");
			String oper = scan.next();
			double result = 0;
			switch(oper) {
			case "+":
				result = num1 + num2;
				System.out.printf("��� ����� %.0f\n", result);
				break;
			case "-":
				result = num1 - num2;
				System.out.printf("��� ����� %.0f\n", result);
				break;
			case "*":
				result = num1 * num2;
				System.out.printf("��� ����� %.0f\n", result);
				break;
			case "/":
				result = num1 / num2;
				System.out.printf("��� ����� %.1f\n", result);
				break;
			case "quit":
				exec = false;
			}
		}
		
		scan.close();
	}
	
}
