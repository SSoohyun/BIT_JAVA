package ex1105;

import java.util.Random;

public class CopyEx {

	public static void main(String[] args) {
		// 연습문제
		// 배열 b의 모든 요소를 배열 a에 복사하는 메소드 copy 작성
		// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드 rcopy 작성
		
		Random rand = new Random();
		
		int[] aArray = new int[5];
		int[] bArray = new int[5];
		
		for(int i=0; i<bArray.length; i++) {
			bArray[i] = rand.nextInt(100)+1;
		}
		
		copy(aArray, bArray);
		System.out.println("순서대로 복사한 후의 결과");
		for(int i=0; i<aArray.length; i++) {
			System.out.printf("a[%d] = %d, b[%d] = %d\n", i, aArray[i], i, bArray[i]);
		}
		
		rcopy(aArray, bArray);
		System.out.println("역순으로 복사한 후의 결과");
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
