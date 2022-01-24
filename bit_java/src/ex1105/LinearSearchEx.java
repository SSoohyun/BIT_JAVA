package ex1105;

import java.util.Random;
import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] intArray = new int[5];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(100)+1; // 1-100사이의 임의의 정수 저장
			
			System.out.println(intArray[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 값을 입력하세요 >> ");
		int key = scan.nextInt();
		
		// 반환값에 따라 출력
		if(seqSearch(intArray, key) != -1) {
			System.out.printf("%d은/는 인덱스 %d에 위치함\n", key, seqSearch(intArray, key));
		} else {
			System.out.printf("%d은/는 배열에 존재하지 않음\n", key);
		}
	}
	
	// 선형 검색
	public static int seqSearch(int[] iArray, int key) {
		for(int i=0; i<iArray.length; i++) {
			if(key == iArray[i]) { // 값을 찾으면 해당 인덱스 반환
				return i;
			}
		}
		return -1;
	}

}
