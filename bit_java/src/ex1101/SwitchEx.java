package ex1101;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int num = 10;
		/*
		switch(num) {
		case 1: // num == 1���� �Ǵ�
			System.out.println("���ڴ� ��");
			break; // switch�� Ż��
		case 2:
			System.out.println("���ڴ� ��");
			break;
		case 3:
			System.out.println("���ڴ� ��");
			break;
		default:
			System.out.println("���ڴ� �ϵ� �ƴϰ� �̵� �ƴϰ� �ﵵ �ƴ�");
		} // ����ġ�� ��
		*/
		
		
		// ����
//		int score = 90;
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;	
//		}
		
		
		/*
		 * �������� 
		 * ������ A, B�� ���: �� ������ 
		 * C, D: �� �� ����� 
		 * F: ���� �б⿡ �ٽ� ������
		 * 
		 * ���ڿ��� ���, ���� �� ���ϱ� ���ؼ��� equals() �޼ҵ� ��� 
		 * -> �ڹ� ���� 5���ʹ� case �ڿ� ���� ���ǽİ� ������ equals()���� �� 
		 * ���ڿ����� ù ��° �ڸ��� ���ڸ� �̾Ƴ��� �޼ҵ�: charAt(0)
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("������ �Է��Ͻÿ� -->> ");
//		String grade = scan.next(); // ���ڸ� �Է¹ް� ���� �� " ", charŸ��(' ')���� ���� �� �ִ� �޼ҵ�x
//		switch(grade /*grade.charAt(0)*/) {
//		case "A":
//		case "B":
//			System.out.println("�� ������");
//			break;
//		case "C":
//		case "D":
//			System.out.println("�� �� �����");
//			break;
//		default:
//			System.out.println("���� �б⿡ �ٽ� ������!");
//			break;
//		}
//		
//		System.out.print("������ �Է��Ͻÿ� -->> ");
//		int score = scan.nextInt();
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("�� ������");
//			break;
//		case 8:
//		case 7:
//			System.out.println("�� �� �����");
//			break;
//		default:
//			System.out.println("���� �б⿡ �ٽ� ������!");
//			break;
//		}
		
	}

}
