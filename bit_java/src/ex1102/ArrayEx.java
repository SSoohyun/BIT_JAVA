package ex1102;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int[] scores1 = {11, 22, 33, 44, 55, 66, 77, 88}; // ũ�Ⱑ 5�� ������ ������ �� �ִ� �迭 ��ü �����Ͽ�
		                                      // ���� 11���� 55������ �ʱ�ȭ
//		System.out.println(scores1[0]);
//		scores1[0] = 100; // �� ����
//		System.out.println(scores1[0]);
//		System.out.println("�迭�� ũ��: " + scores1.length);
		
		
		// �迭�� �̷��� �����ϴ� ���� ������!
		int[] scores2 = new int[5]; // ũ�Ⱑ 5�� ������ ������ �� �ִ� �迭 ��ü ���� --> 0���� �ʱ�ȭ
		double[] dArray = new double[3]; // 0.0���� �ʱ�ȭ
		char[] cArray = new char[3]; // ' '(����, �����̽�)���� �ʱ�ȭ
		boolean[] bArray = new boolean[3]; // false�� �ʱ�ȭ
		//String[] strArray = new String[3]; // null�� �ʱ�ȭ
		
		
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
		
		
//		System.out.println("�迭 ���� ����");
//		for(int i=0; i<scores2.length; i++) {
//			System.out.println(scores2[i]);
//		}
//		
//		System.out.println("���ο� �� ���� ��");
//		// 1���� 100���� ����
//		for(int i=0; i<scores2.length; i++) {
//			scores2[i] = i+1;
//			System.out.println(scores2[i]);
//		}
		
//		System.out.println(scores2[0]);
//		scores2[0] = 200; // �� ����
//		System.out.println(scores2[0]);
//		System.out.println("�迭�� ũ��: " + scores2.length);
		
		
		
		// ����
		// ���� ū �� ã��
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] iArray = new int[5];
		int maxNum = -2147000; // ���� ū ��
		// ����
		for(int i=0; i<iArray.length; i++) {
			//iArray[i] = scan.nextInt();
			
			// 1-100 ������ ������ ������ �߻����Ѽ� �����Ͻÿ�.
			iArray[i] = rand.nextInt(10) + 1; // 1-100
			
			// ���� ū �� ã��
			if(iArray[i] > maxNum) {
				maxNum = iArray[i];
			}
		}
//		System.out.printf("���� ū ���� %d\n", maxNum);
		
		// ���
		for(int i=0; i<iArray.length; i++) {
//			System.out.println(iArray[i]);
		}
		
		// �迭 ������ ��� ���ϱ�
//		int sum = 0;
//		for(int i=0; i<iArray.length; i++) {
//			sum += iArray[i];
//		}
//		System.out.println("����� " + (double)sum/iArray.length);
		
		
//		System.out.println(iArray[0]);
		
		/*
		System.out.println(args.length); // args --> "aa" "bb" "cc": ���ڿ��� ����
		System.out.println(args); // �ּҰ�
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		
		// ����
		// ���ڸ�ŭ ���
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		// *: ��� ���� �ǹ�
//		for(int i=0; i<Integer.parseInt(args[1]); i++) { // Integer.parseInt() --> ���ڷ� �ٲ���
//			System.out.println(args[0]);
//		}
		
		/*
		String[] strArray = new String[4];
		System.out.println("�迭 ��ü ���� ��");
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("���� ��");
		strArray[0] = "Hello";
		strArray[1] = "java";
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		// Increment
		int[] x = {0};
		System.out.println("ȣ�� ���� x[0] = " + x[0]);
		increment(x);
		System.out.println("ȣ�� ���� x[0] = " + x[0]);
		
		 */		
		
		// for-each: ���� for��
//		for(String str : args) {
//			System.out.println(str);
//		}
//		
//		int[] inArray = new int[10];
//		for(int i=0; i<inArray.length; i++) {
//			inArray[i] = rand.nextInt(100) + 1;
//		}
//		
//		for(int i=0; i<inArray.length; i++) {
//			System.out.println(inArray[i]);
//		}
//		
//		for(int num : inArray) {
//			System.out.println(num);
//		}
//		
		
		// ����
		// args ���
		double sum = 0;
		for(String num : args) {
			System.out.println(num);
			sum += Double.parseDouble(num); // String --> double
		}
		System.out.println("�Է¹��� ���ڵ��� ���: " + sum/args.length);
		
	}
	
	// Increment
	// ������: ���������� �Ѱ��ֹǷ� ���� ��ü�� ����
//	public static void increment(int[] n) { // n�� �Ű�����
//		System.out.println("increment() �޼ҵ� ������");
//		System.out.print("n[0] = " + n[0] + " --> ");
//		n[0]++;
//		System.out.println("n[0] = " + n[0]);
//	}

}
