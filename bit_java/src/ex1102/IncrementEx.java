package ex1102;

import java.util.Scanner;

public class IncrementEx {
/*
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() �޼ҵ� ȣ�� ���� x:" + x);
		increment(x); // x�� argument(����)
		System.out.println("increment() �޼ҵ� ȣ�� ���� x:" + x);

	}
	
	// �⺻��: �⺻�� �Ű����� --> �� ����ǰ� ������
	public static void increment(int n) { // n�� �Ű�����
		System.out.println("increment() �޼ҵ� ���� ���� n:" + n);
		n++;
		System.out.println("increment() �޼ҵ� ���� ���� n:" + n);
	}
	*/
	
	
	
	/*
	 * �������� 
	 * 2���� ������ �Է¹޾� ��Ģ������ �����ϴ� �޼ҵ� �ۼ��ϰ�, �װ��� �����ϴ� ���α׷�
	 * ���� �޼ҵ忡�� ȣ���Ͽ� ���� Ȯ��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2���� ������ �Է��ϼ��� >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.printf("%d�� %d�� ���� %d\n", num1, num2, add(num1, num2));
		System.out.printf("%d�� %d�� ���� %d\n", num1, num2, minus(num1, num2));
		System.out.printf("%d�� %d�� ���� %d\n", num1, num2, multi(num1, num2));
		System.out.printf("%d ������ %d�� %.16f\n", num1, num2, divide(num1, num2));
	}
	
	public static int add(int i, int j) {
		return i+j;
	}
	
	public static int minus(int i, int j) {
		return i-j;
	}
	
	public static int multi(int i, int j) {
		return i*j;
	}
	
	public static double divide(int i, int j) {
		return (double)i/(double)j;
	}
}
