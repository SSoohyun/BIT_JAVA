package ex1101;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		/*
		 * ��������
		 * �α��� ���α׷� 
		 * ���̵�� �н����带 �Է��ϰ� ��ϵ� ���̵�� �н����带 ���� ���� 
		 * ���ǿ� ���� �α��� ���� �Ǵ� �α��� ���и� ���
		 */
		Scanner scan = new Scanner(System.in);
		
//		String id = "conan";
//		String pwd = "1111";
//		System.out.print("������� ���̵� �Է�: ");
//		String inputID = scan.next();
//		System.out.print("������� �н����� �Է�: ");
//		String inputPWD = scan.next();
//		
//		
//		if(inputID.equals(id)) {
//			if(inputPWD.equals(pwd)) {
//				System.out.println("�α��ο� �����ϼ̽��ϴ�.");
//			} else {
//				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//			}
//		} else {
//			System.out.println("��ϵ� ����ڰ� �ƴմϴ�. ȸ�� ������ Ȯ���ϼ���.");
//		}
		
		
		
		System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
		String one = "1111";
		// ���ڿ��� ����� ����� ���� ������ �ٸ��� ������
		String str = scan.next(); // "1111"
		System.out.printf("�Է¹��� ���: %s\n", str);
		System.out.println("1111" == str); // false
		System.out.println("1111" == one); // true
		System.out.println("1111".equals(str)); // ���ڿ��� ������ ������ ���� ��, true
		System.out.println("1111".equals(one)); // true
		
	}

}
