package hw1102;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] iArray = new int[5]; // int 배열 선언
		int maxNum = -2147000; // 가장 큰 수
		
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = scan.nextInt(); // 배열에 값 저장
			
			// 가장 큰 수 찾기
			if(iArray[i] > maxNum) {
				maxNum = iArray[i];
			}
		}
		System.out.printf("가장 큰 수는 %d\n", maxNum);

	}

}
