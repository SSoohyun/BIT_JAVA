package ex1105;

import java.util.Random;
import java.util.Scanner;


public class ArrayEx {

	public static void main(String[] args) {
//		int[] intArray = new int[5];
//		Random rand = new Random();
//		
//		for(int i=0; i<intArray.length; i++) {
//			intArray[i] = rand.nextInt(100)+1;
//			System.out.printf("�迭�� ����� ���� intArray[%d]=%d\n", i, intArray[i]);
//		}
//		
//		int max = intArray[0];
//
//		for(int i=1; i<intArray.length; i++) {
//			if(intArray[i]>max) {
//				max = intArray[i];
//			}
//		}
//		
//		System.out.printf("�ִ밪: %d", max);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� >> ");
//		int size = scan.nextInt();
//		int[] iArray = new int[size];
//		for(int i=0; i<size; i++) {
//			System.out.print("������ �Է��Ͻÿ� >> ");
//			iArray[i] = scan.nextInt();
//		}
//		
//		int max = iArray[0];
//		System.out.printf("�迭�� ����� ���� intArray[%d]=%d\n", 0, iArray[0]);
//		for(int i=1; i<iArray.length; i++) {
//			System.out.printf("�迭�� ����� ���� intArray[%d]=%d\n", i, iArray[i]);
//			if(iArray[i]>max) {
//				max = iArray[i];
//			}
//		}
//		
//		System.out.printf("�ִ밪: %d", max);
		
		
		
		// �迭�� ���ڷ� �Ѱܹ޾� �ִ��� ��ȯ�ϴ� �޼ҵ带 �����ϰ�
		// ȣ���Ͽ� ������ ����� ����ϴ� ���α׷� �ۼ��ϱ�
		int[] intArray = new int[5];
		Random rand = new Random();
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(100)+1;
			System.out.printf("�迭�� ����� ���� intArray[%d]=%d\n", i, intArray[i]);
		}
		
		System.out.printf("�ִ밪: %d", max(intArray));
		
	}
	
	public static int max(int[] iArray) {
		int max = iArray[0];
		for(int i=1; i<iArray.length; i++) {
			if(iArray[i]>max) {
				max = iArray[i];
			}
		}
		
		return max;
		
	}

}
