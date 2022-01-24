package ex1105;

import java.util.Random;
import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] intArray = new int[5];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(100)+1; // 1-100������ ������ ���� ����
			
			System.out.println(intArray[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� ���� �Է��ϼ��� >> ");
		int key = scan.nextInt();
		
		// ��ȯ���� ���� ���
		if(seqSearch(intArray, key) != -1) {
			System.out.printf("%d��/�� �ε��� %d�� ��ġ��\n", key, seqSearch(intArray, key));
		} else {
			System.out.printf("%d��/�� �迭�� �������� ����\n", key);
		}
	}
	
	// ���� �˻�
	public static int seqSearch(int[] iArray, int key) {
		for(int i=0; i<iArray.length; i++) {
			if(key == iArray[i]) { // ���� ã���� �ش� �ε��� ��ȯ
				return i;
			}
		}
		return -1;
	}

}
