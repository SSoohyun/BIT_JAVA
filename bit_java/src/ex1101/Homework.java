package ex1101;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* ���� 1 */
		/*
		System.out.print("�������� ���۴� �Է� --> ");
		int start = scan.nextInt(); 
		System.out.print("�������� ���� �Է� --> ");
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
		
		
		/* ���� 2 */
		System.out.print("������ �Է��ϼ��� >> ");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++, System.out.println()) {
			for(int j=1; j<=i; j++) {
				System.out.print(' ');
				System.out.print(i);
			}
		}
		
			
		/*
		 * ���� 3
		 * ���� �ݺ����� ��Ģ������ ����ϴ� ���α׷� 
		 * ������� �Ҽ��� ù°�ڸ����� ���
		 * quit�� �Է��ϸ� ���α׷� ����
		 */
		/*
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
		*/
		
		/* ���� 4 */
//		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
//		System.out.print("�Է� >> ");
//		int number = scan.nextInt();
//		while(true) {
//			System.out.print("�Է� >> ");
//			number = scan.nextInt();
//			if(number>=10 && number <=99) {
//				System.out.printf("�Է¹��� ������ ���� %d��\n", number);
//				break;
//			}
//		}
		
		
		
		/* ���� 5 */
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
//			System.out.printf("�ﰢ���� ����: %.1f\n", tri);
//			i++;
//		}
		
		
		
	}

}
