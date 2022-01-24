package ex1104;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {		
//		try {
//			System.out.println(4/0);
//			System.out.println(Integer.parseInt("12.0")); // 예외발생 가능성 있음
//		}
//		// 오류 발생했을 때
//		catch(ArithmeticException e) {
//			System.out.println("예외 발생했음");
//			System.out.println(e.getMessage()); // 어떤 예외가 발생했는지 메시지 출력
//			e.printStackTrace();
//		}
		
//		catch(NumberFormatException e) {
//			System.out.println("예외 발생했음");
//			System.out.println(e.getMessage()); // 어떤 예외가 발생했는지 메시지 출력
//		}
		
		// 예제 1
		Scanner scan = new Scanner(System.in);
		System.out.print("나뉨수를 입력하시오: ");
		int a = scan.nextInt();
		System.out.print("나뉨수를 입력하시오: ");
		int b = scan.nextInt();
		try {
			a /= b;
		} 
		catch(ArithmeticException e) {
			System.out.printf("%d으로 나눌 수 없습니다.\n", b);
		}
		
		
		// 예제 2
		int[] intArray = {0, 1, 3, 6};
		try {
			for(int i=0; i<5; i++) {
				System.out.printf("intArray[%d]=%d\n", i, intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
		
		
		// 예제 3
		String[] stringNumber = {"23", "12", "998", "3.141592"};
		
		try {
			for(int i=0; i<stringNumber.length; i++) {
				System.out.printf("숫자로 변환된 값은 %d\n", Integer.parseInt(stringNumber[i]));
			}
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
		
	}

}
