package ex1105;

import java.util.Random;

public class CopyEx {

	public static void main(String[] args) {
		// ��������
		// �迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼ҵ� copy �ۼ�
		// �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼ҵ� rcopy �ۼ�
		
		Random rand = new Random();
		
		int[] aArray = new int[5];
		int[] bArray = new int[5];
		
		for(int i=0; i<bArray.length; i++) {
			bArray[i] = rand.nextInt(100)+1;
		}
		
		copy(aArray, bArray);
		System.out.println("������� ������ ���� ���");
		for(int i=0; i<aArray.length; i++) {
			System.out.printf("a[%d] = %d, b[%d] = %d\n", i, aArray[i], i, bArray[i]);
		}
		
		rcopy(aArray, bArray);
		System.out.println("�������� ������ ���� ���");
		for(int i=0; i<aArray.length; i++) {
			System.out.printf("a[%d] = %d, b[%d] = %d\n", i, aArray[i], i, bArray[i]);
		}
		
		
	}
	public static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-1-i];
		}
	}

}
