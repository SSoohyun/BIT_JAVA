package ex1101;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
//		for(int i=0 /* �ʱ�� */; i<2 /* �ݺ� Ƚ����ŭ ������ ������� ���� */; i++ /* ���๮�� ������ �� �� �� */) {
//			System.out.println("hello world"); // �ݺ��ؾ� �� ��
//		}
		
		/*
		 * for(int i=0; i<100; i++) { System.out.println((i+1) + ": hello world"); }
		 */
		
		
		// ����
		/*
		int sum = 0;
		for(int i=1; i<=10; i++, System.out.println(i)) { // i+=2�ϸ� Ȧ���� ��
			sum += i;
		}
		System.out.println("1���� 10������ ���� " + sum);
		
		
		int dan = 3;
		for(int i=1; i<10; i++) { // for�� ����
			System.out.println(dan + " * " + i + " = " + dan*i);
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		} // for�� ��
		*/
		
		// ����
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			}
//		}
		
		
		// ��������
		// �������� ���η� ���
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
//		System.out.println("1���� 10������ ���� " + sum);
		
		
		// ����
		int num = 1;
		int minNum = 0;
		while(num <= 100) {
			if(num%3==0 && num%8==0) {
				System.out.printf("�����: %d\n", num);
				if(minNum == 0) {
					minNum = num;
				}
			}
			num++;
		}
		System.out.printf("�ּҰ����: %d", minNum);
	
		
		
		/*
		 * �������� 
		 * ���� �ݺ����� ��Ģ������ ����ϴ� ���α׷� 
		 * ������� �Ҽ��� ù°�ڸ����� ���
		 */
		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("ù ��° ���� �Է�: ");
//			int num1 = scan.nextInt();
//			System.out.print("�� ��° ���� �Է�: ");
//			int num2 = scan.nextInt();
//			System.out.print("���� ��ȣ �Է�: ");
//			String oper = scan.next();
//			double result = 0;
//			switch(oper) {
//			case "+":
//				result = num1 + num2;
//				System.out.printf("��� ����� %.0f\n", result);
//				break;
//			case "-":
//				result = num1 - num2;
//				System.out.printf("��� ����� %.0f\n", result);
//				break;
//			case "*":
//				result = num1 * num2;
//				System.out.printf("��� ����� %.0f\n", result);
//				break;
//			case "/":
//				result = num1 / num2;
//				System.out.printf("��� ����� %.1f\n", result);
//				break;
//			}
//		}
		
		/*
		 * �������� 
		 * ���� 1ȸ�� ������� 1250������ ī�带 ����� ������ ���Ƚ���� ��� �� �ܾ��� ��� 
		 * ���� �ݾ��� ����� ����, ���Ƚ���� �Բ� �ܾ��� ��� 
		 * �ܾ��� �����ϸ� ��� ����
		 */
//		System.out.print("���� �����ݾ� -->> ");
//		int money = scan.nextInt();
//		System.out.printf("%d���� �����Ǿ���\n", money);
//		int cnt = 1;
//		while(money >= 1250) {
//			money -= 1250;
//			System.out.printf("%dȸ ����� �� ���� �ܾ��� %d��\n", cnt, money);
//			cnt++;
//		}
		
		
		// do~while
//		int i = 1;
//		int sum = 0;
//		do {
//			sum += i;
//			i++;
//		} while(i <= 10);
//		System.out.println("1���� 10������ ���� " + sum);
		
		
		// ����
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
