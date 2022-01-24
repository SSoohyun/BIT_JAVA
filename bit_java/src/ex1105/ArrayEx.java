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
//			System.out.printf("배열에 저장된 값은 intArray[%d]=%d\n", i, intArray[i]);
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
//		System.out.printf("최대값: %d", max);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("배열의 크기를 입력하시오 >> ");
//		int size = scan.nextInt();
//		int[] iArray = new int[size];
//		for(int i=0; i<size; i++) {
//			System.out.print("정수를 입력하시오 >> ");
//			iArray[i] = scan.nextInt();
//		}
//		
//		int max = iArray[0];
//		System.out.printf("배열에 저장된 값은 intArray[%d]=%d\n", 0, iArray[0]);
//		for(int i=1; i<iArray.length; i++) {
//			System.out.printf("배열에 저장된 값은 intArray[%d]=%d\n", i, iArray[i]);
//			if(iArray[i]>max) {
//				max = iArray[i];
//			}
//		}
//		
//		System.out.printf("최대값: %d", max);
		
		
		
		// 배열을 인자로 넘겨받아 최댓값을 반환하는 메소드를 선언하고
		// 호출하여 동일한 결과를 출력하는 프로그램 작성하기
		int[] intArray = new int[5];
		Random rand = new Random();
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(100)+1;
			System.out.printf("배열에 저장된 값은 intArray[%d]=%d\n", i, intArray[i]);
		}
		
		System.out.printf("최대값: %d", max(intArray));
		
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
