package hw1102;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] iArray = new int[5]; // int �迭 ����
		int maxNum = -2147000; // ���� ū ��
		
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = scan.nextInt(); // �迭�� �� ����
			
			// ���� ū �� ã��
			if(iArray[i] > maxNum) {
				maxNum = iArray[i];
			}
		}
		System.out.printf("���� ū ���� %d\n", maxNum);

	}

}
