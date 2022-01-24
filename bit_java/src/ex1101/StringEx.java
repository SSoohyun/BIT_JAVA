package ex1101;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		
		/*
		 * 연습문제
		 * 로그인 프로그램 
		 * 아이디와 패스워드를 입력하고 등록된 아이디와 패스워드를 비교한 다음 
		 * 조건에 맞춰 로그인 성공 또는 로그인 실패를 출력
		 */
		Scanner scan = new Scanner(System.in);
		
//		String id = "conan";
//		String pwd = "1111";
//		System.out.print("사용자의 아이디 입력: ");
//		String inputID = scan.next();
//		System.out.print("사용자의 패스워드 입력: ");
//		String inputPWD = scan.next();
//		
//		
//		if(inputID.equals(id)) {
//			if(inputPWD.equals(pwd)) {
//				System.out.println("로그인에 성공하셨습니다.");
//			} else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		} else {
//			System.out.println("등록된 사용자가 아닙니다. 회원 정보를 확인하세요.");
//		}
		
		
		
		System.out.print("비밀번호를 입력하세요 >> ");
		String one = "1111";
		// 문자열을 만드는 방법에 따라서 같은지 다른지 결정됨
		String str = scan.next(); // "1111"
		System.out.printf("입력받은 비번: %s\n", str);
		System.out.println("1111" == str); // false
		System.out.println("1111" == one); // true
		System.out.println("1111".equals(str)); // 문자열의 내용이 같은지 비교할 때, true
		System.out.println("1111".equals(one)); // true
		
	}

}
