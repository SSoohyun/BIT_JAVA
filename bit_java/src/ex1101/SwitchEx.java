package ex1101;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int num = 10;
		/*
		switch(num) {
		case 1: // num == 1인지 판단
			System.out.println("숫자는 일");
			break; // switch문 탈출
		case 2:
			System.out.println("숫자는 이");
			break;
		case 3:
			System.out.println("숫자는 삼");
			break;
		default:
			System.out.println("숫자는 일도 아니고 이도 아니고 삼도 아님");
		} // 스위치의 끝
		*/
		
		
		// 예제
//		int score = 90;
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;	
//		}
		
		
		/*
		 * 연습문제 
		 * 학점이 A, B인 경우: 참 잘했음 
		 * C, D: 좀 더 노력해 
		 * F: 다음 학기에 다시 만나요
		 * 
		 * 문자열인 경우, 같은 지 비교하기 위해서는 equals() 메소드 사용 
		 * -> 자바 버전 5부터는 case 뒤에 값과 조건식과 같은지 equals()없이 비교 
		 * 문자열에서 첫 번째 자리의 문자만 뽑아내는 메소드: charAt(0)
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("학점을 입력하시오 -->> ");
//		String grade = scan.next(); // 문자를 입력받고 싶을 때 " ", char타입(' ')으로 받을 수 있는 메소드x
//		switch(grade /*grade.charAt(0)*/) {
//		case "A":
//		case "B":
//			System.out.println("참 잘했음");
//			break;
//		case "C":
//		case "D":
//			System.out.println("좀 더 노력해");
//			break;
//		default:
//			System.out.println("다음 학기에 다시 만나요!");
//			break;
//		}
//		
//		System.out.print("점수를 입력하시오 -->> ");
//		int score = scan.nextInt();
//		switch(score/10) {
//		case 10:
//		case 9:
//			System.out.println("참 잘했음");
//			break;
//		case 8:
//		case 7:
//			System.out.println("좀 더 노력해");
//			break;
//		default:
//			System.out.println("다음 학기에 다시 만나요!");
//			break;
//		}
		
	}

}
