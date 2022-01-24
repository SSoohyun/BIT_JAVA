package ex1102;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int[] scores1 = {11, 22, 33, 44, 55, 66, 77, 88}; // 크기가 5인 정수를 저장할 수 있는 배열 객체 생성하여
		                                      // 값이 11부터 55까지로 초기화
//		System.out.println(scores1[0]);
//		scores1[0] = 100; // 값 변경
//		System.out.println(scores1[0]);
//		System.out.println("배열의 크기: " + scores1.length);
		
		
		// 배열은 이렇게 선언하는 것이 보편적!
		int[] scores2 = new int[5]; // 크기가 5인 정수를 저장할 수 있는 배열 객체 생성 --> 0으로 초기화
		double[] dArray = new double[3]; // 0.0으로 초기화
		char[] cArray = new char[3]; // ' '(공백, 스페이스)으로 초기화
		boolean[] bArray = new boolean[3]; // false로 초기화
		//String[] strArray = new String[3]; // null로 초기화
		
		
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
		
		
//		System.out.println("배열 생성 직후");
//		for(int i=0; i<scores2.length; i++) {
//			System.out.println(scores2[i]);
//		}
//		
//		System.out.println("새로운 값 저장 후");
//		// 1부터 100까지 저장
//		for(int i=0; i<scores2.length; i++) {
//			scores2[i] = i+1;
//			System.out.println(scores2[i]);
//		}
		
//		System.out.println(scores2[0]);
//		scores2[0] = 200; // 값 변경
//		System.out.println(scores2[0]);
//		System.out.println("배열의 크기: " + scores2.length);
		
		
		
		// 예제
		// 가장 큰 수 찾기
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] iArray = new int[5];
		int maxNum = -2147000; // 가장 큰 수
		// 저장
		for(int i=0; i<iArray.length; i++) {
			//iArray[i] = scan.nextInt();
			
			// 1-100 사이의 임의의 정수를 발생시켜서 저장하시오.
			iArray[i] = rand.nextInt(10) + 1; // 1-100
			
			// 가장 큰 수 찾기
			if(iArray[i] > maxNum) {
				maxNum = iArray[i];
			}
		}
//		System.out.printf("가장 큰 수는 %d\n", maxNum);
		
		// 출력
		for(int i=0; i<iArray.length; i++) {
//			System.out.println(iArray[i]);
		}
		
		// 배열 원소의 평균 구하기
//		int sum = 0;
//		for(int i=0; i<iArray.length; i++) {
//			sum += iArray[i];
//		}
//		System.out.println("평균은 " + (double)sum/iArray.length);
		
		
//		System.out.println(iArray[0]);
		
		/*
		System.out.println(args.length); // args --> "aa" "bb" "cc": 문자열로 저장
		System.out.println(args); // 주소값
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		
		// 예제
		// 숫자만큼 출력
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		// *: 모든 것을 의미
//		for(int i=0; i<Integer.parseInt(args[1]); i++) { // Integer.parseInt() --> 숫자로 바꿔줌
//			System.out.println(args[0]);
//		}
		
		/*
		String[] strArray = new String[4];
		System.out.println("배열 객체 생성 후");
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("저장 후");
		strArray[0] = "Hello";
		strArray[1] = "java";
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		// Increment
		int[] x = {0};
		System.out.println("호출 전의 x[0] = " + x[0]);
		increment(x);
		System.out.println("호출 후의 x[0] = " + x[0]);
		
		 */		
		
		// for-each: 향상된 for문
//		for(String str : args) {
//			System.out.println(str);
//		}
//		
//		int[] inArray = new int[10];
//		for(int i=0; i<inArray.length; i++) {
//			inArray[i] = rand.nextInt(100) + 1;
//		}
//		
//		for(int i=0; i<inArray.length; i++) {
//			System.out.println(inArray[i]);
//		}
//		
//		for(int num : inArray) {
//			System.out.println(num);
//		}
//		
		
		// 예제
		// args 평균
		double sum = 0;
		for(String num : args) {
			System.out.println(num);
			sum += Double.parseDouble(num); // String --> double
		}
		System.out.println("입력받은 인자들의 평균: " + sum/args.length);
		
	}
	
	// Increment
	// 참조형: 참조변수를 넘겨주므로 같은 객체를 참조
//	public static void increment(int[] n) { // n은 매개변수
//		System.out.println("increment() 메소드 내부임");
//		System.out.print("n[0] = " + n[0] + " --> ");
//		n[0]++;
//		System.out.println("n[0] = " + n[0]);
//	}

}
