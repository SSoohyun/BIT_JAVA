package ex1104;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {		
//		try {
//			System.out.println(4/0);
//			System.out.println(Integer.parseInt("12.0")); // ���ܹ߻� ���ɼ� ����
//		}
//		// ���� �߻����� ��
//		catch(ArithmeticException e) {
//			System.out.println("���� �߻�����");
//			System.out.println(e.getMessage()); // � ���ܰ� �߻��ߴ��� �޽��� ���
//			e.printStackTrace();
//		}
		
//		catch(NumberFormatException e) {
//			System.out.println("���� �߻�����");
//			System.out.println(e.getMessage()); // � ���ܰ� �߻��ߴ��� �޽��� ���
//		}
		
		// ���� 1
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ�: ");
		int a = scan.nextInt();
		System.out.print("�������� �Է��Ͻÿ�: ");
		int b = scan.nextInt();
		try {
			a /= b;
		} 
		catch(ArithmeticException e) {
			System.out.printf("%d���� ���� �� �����ϴ�.\n", b);
		}
		
		
		// ���� 2
		int[] intArray = {0, 1, 3, 6};
		try {
			for(int i=0; i<5; i++) {
				System.out.printf("intArray[%d]=%d\n", i, intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
		
		
		// ���� 3
		String[] stringNumber = {"23", "12", "998", "3.141592"};
		
		try {
			for(int i=0; i<stringNumber.length; i++) {
				System.out.printf("���ڷ� ��ȯ�� ���� %d\n", Integer.parseInt(stringNumber[i]));
			}
		}
		catch(NumberFormatException e) {
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		}
		
	}

}
