package ex1101;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		
//		if(!true) {
//			System.out.println("��");
//		}
		
		boolean isRaining = true;
		if(isRaining) { // if ����
//			System.out.println("����� ������ ������."); // ���๮�� �ϳ��� ��� {} ���� ����
//			System.out.println("��ȭ�� �Ŵ´�.");
//			System.out.println("���� �������... ������ ����.");
		} // if ��
		
		
		// ����
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("������ �Է��Ͻÿ� --> ");
//		int score = scan.nextInt();
//		if(score >= 80) {
//			System.out.println("�����մϴ�! �հ��Դϴ�.");
//		}
		
//		/* if(score < 80) */ else {
//			System.out.println("���հ��Դϴ�. �� �� ����ϼ���.");
//		}
		
		
		// ��������
		// ����� �µ��� �����Ͽ� ���� �ڵ����� �����ϴ� ��ġ
		// ����� �µ��� �Է� -> 40 �̻��̸� �� ����, �̸��̸� �� ����
		/*
		 * System.out.print("����� �µ��� �Է��ϼ���: "); double temp = scan.nextDouble(); if(temp
		 * >= 40) { System.out.println("��(Fan) ����"); } else {
		 * System.out.println("��(Fan) ����"); }
		 */
		
		
		// ��������
		// ����ڰ� �Է��� ���� ������ 3���� ���� ��, 
		// �Ҽ��� ù �ڸ����� �ݿø��� ������ ���
//		System.out.print("���� ���� �Է�: ");
//		int num = scan.nextInt();
//		if((num%3 == 0) || (num%3 == 1)) {
//			System.out.printf("���: %d\n", num/3);
//		} else {
//			System.out.printf("���: %d\n", num/3 + 1);
//		}
		
		
		
		// ����
		/*
		 * int score = 90; if(score >= 90) { System.out.println("A"); } else if(score >=
		 * 80) { System.out.println("B"); } else if(score >= 70) {
		 * System.out.println("C"); } else if(score >= 60) { System.out.println("D"); }
		 * else { System.out.println("F"); }
		 */
		
		
		// ��������
		// ���⸦ ���� ����ϸ� ������ ���� --> �ܰ��� �⺻��� ���
		// ������ = �⺻��� + ��뷮 * �ܰ�
		/*
		System.out.print("���� ��뷮�� �Է��ϼ��� --> ");
		double usage = scan.nextDouble();
		int base; // �⺻ ���
		double unitPrice; // �ܰ�
		double fee; // ���� ���
		
		if(usage <= 200) {
			unitPrice = 99.3;
			base = 910;
		} else if(usage <= 400) {
			unitPrice = 187.9;
			base = 1600;
		} else {
			unitPrice = 280.6;
			base = 7300;
		}
		fee = base + (usage * unitPrice);
		
		System.out.printf("��뷮: %.1f kwh\n", usage);
		System.out.printf("�⺻ ���: %d ��\n", base);
		System.out.printf("�ܰ�: %.1f ��\n", unitPrice);
		System.out.printf("���� ���: %.1f ��\n", fee);
		
		*/
		
		// ��������
		// ������ ��� ���α׷�
		/*
		System.out.print("���� ��� ����ϱ���� �ɸ� �ð��� �Է��ϼ��� --> ");
		int time = scan.nextInt();
		String life;
		
		if(time < 60) {
			life = "85%";
		} else if(time < 120) {
			life = "76%";
		} else if(time < 180) {
			life = "66%";
		} else if(time < 240) {
			life = "57%";
		} else if(time < 300) {
			life = "47%";
		} else {
			life = "25% �̸�";
		}
		
		System.out.printf("������: %s\n", life);
		*/
		
		/*
		if(���� > 19) {
			if(���� == ����) {
				// ����
			} else {
				// ���븦 ���� ���� �� �ִ�.
			}
			
		} else {
			
		}
		*/
		
		
		// ����
		// ���� �������� �ܼ� ���α׷�
		/*
		System.out.println("1. ��~��, 2. �����, 3. ������");
		System.out.print("������ �����ϼ���(1~3) --> ");
		
		int day = scan.nextInt();
		if(day == 1) { // �ܼ���
			System.out.println("���� �������� �ܼ� ���Դϴ�.");
			System.out.println("1. ����, 2. �¿���");
			System.out.print("������ �����ϼ���(1, 2) --> ");
			
			int car = scan.nextInt();
			if(car == 1) {
				System.out.println("������");
			} else {
				System.out.println("���� �������� ����!!");
			}
			
		} else { // �ܼ���x
			System.out.println("�����, �������� �ܼ����� �ʾƿ�~");
		}
		*/
		
		// ��������
		// ��� ������ �Է��ϸ� ���� �䱸���׿� ���� ����ũ ���� ������ ������ ����ϴ� ���α׷�
		System.out.print("����⵵�� �Է��ϼ��� --> ");
		int birth = scan.nextInt();
		if(2021-birth >= 65) {
			System.out.println("������ ���� ����");
		} else {
			int buy = birth%10;
			if(buy == 1 || buy == 6) {
				System.out.println("������");
			} else if(buy == 2 || buy == 7) {
				System.out.println("ȭ����");
			} else if(buy == 3 || buy == 8) {
				System.out.println("������");
			} else if(buy == 4 || buy == 9) {
				System.out.println("�����");
			} else if(buy == 5 || buy == 0) {
				System.out.println("�ݿ���");
			}
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
