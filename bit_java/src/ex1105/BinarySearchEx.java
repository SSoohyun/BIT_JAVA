package ex1105;

import java.util.Scanner;

public class BinarySearchEx {

	public static void main(String[] args) {
		System.out.println("�����͸� ������������ �Է��Ͻÿ� >> ");
		Scanner scan = new Scanner(System.in);
		int[] iArray = new int[11];
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = scan.nextInt();
		}
		
		for(int i=0; i<iArray.length; i++) {
			System.out.printf("iArray[%d]=%d\n", i, iArray[i]);
		}
		
		System.out.print("�˻��� ���ڸ� �Է��Ͻÿ� >> ");
		int key = scan.nextInt();
		
		// ��ȯ���� ���� ���
		if(binSearch(iArray, key) != -1) {
			System.out.printf("%d��/�� �ε��� %d�� ��ġ��\n", key, binSearch(iArray, key));
		} else {
			System.out.printf("%d��/�� �迭�� �������� ����\n", key);
		}
	}
	
	public static int binSearch(int[] iArray, int key) {
		int low = 0; // 0��° �ε���
		int high = iArray.length-1; // ������ �ε���
		
		while(low <= high) {
			int mid = (low+high)/2; // �߰� �ε���(�Ź� ���ŵǾ���ϹǷ� low+high�� ��)
			if(iArray[mid] == key) {
				return mid;
			} else if(iArray[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return -1;
	}

}