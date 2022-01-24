package ex1105;

import java.util.Scanner;

public class BinarySearchEx {

	public static void main(String[] args) {
		System.out.println("데이터를 오름차순으로 입력하시오 >> ");
		Scanner scan = new Scanner(System.in);
		int[] iArray = new int[11];
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = scan.nextInt();
		}
		
		for(int i=0; i<iArray.length; i++) {
			System.out.printf("iArray[%d]=%d\n", i, iArray[i]);
		}
		
		System.out.print("검색할 숫자를 입력하시오 >> ");
		int key = scan.nextInt();
		
		// 반환값에 따라 출력
		if(binSearch(iArray, key) != -1) {
			System.out.printf("%d은/는 인덱스 %d에 위치함\n", key, binSearch(iArray, key));
		} else {
			System.out.printf("%d은/는 배열에 존재하지 않음\n", key);
		}
	}
	
	public static int binSearch(int[] iArray, int key) {
		int low = 0; // 0번째 인덱스
		int high = iArray.length-1; // 마지막 인덱스
		
		while(low <= high) {
			int mid = (low+high)/2; // 중간 인덱스(매번 갱신되어야하므로 low+high의 반)
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