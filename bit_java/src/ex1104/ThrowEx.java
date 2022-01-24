package ex1104;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) /* throws NumberFormatException */{
		Scanner scan = new Scanner(System.in);
		try {
			square(scan.next());
		} catch(Exception e) {
			System.out.println("정수가 아닙니다.");
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void square(String str) throws NumberFormatException {
//		try {
//			int n = Integer.parseInt(str);
//			System.out.println(n * n);
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		int n = Integer.parseInt(str);
		System.out.println(n * n);
		
	}

}
