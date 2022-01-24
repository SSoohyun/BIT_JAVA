package ex1101;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		
//		if(!true) {
//			System.out.println("참");
//		}
		
		boolean isRaining = true;
		if(isRaining) { // if 시작
//			System.out.println("우산을 가지고 나간다."); // 실행문이 하나인 경우 {} 생략 가능
//			System.out.println("장화를 신는다.");
//			System.out.println("가긴 어딜가니... 집에서 쉰다.");
		} // if 끝
		
		
		// 예제
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("점수를 입력하시오 --> ");
//		int score = scan.nextInt();
//		if(score >= 80) {
//			System.out.println("축하합니다! 합격입니다.");
//		}
		
//		/* if(score < 80) */ else {
//			System.out.println("불합격입니다. 좀 더 노력하세요.");
//		}
		
		
		// 연습문제
		// 기계의 온도를 감지하여 팬을 자동으로 구동하는 장치
		// 기계의 온도를 입력 -> 40 이상이면 팬 가동, 미만이면 팬 중지
		/*
		 * System.out.print("기계의 온도를 입력하세요: "); double temp = scan.nextDouble(); if(temp
		 * >= 40) { System.out.println("팬(Fan) 가동"); } else {
		 * System.out.println("팬(Fan) 중지"); }
		 */
		
		
		// 연습문제
		// 사용자가 입력한 양의 정수를 3으로 나눈 후, 
		// 소수점 첫 자리에서 반올림한 정수를 출력
//		System.out.print("양의 정수 입력: ");
//		int num = scan.nextInt();
//		if((num%3 == 0) || (num%3 == 1)) {
//			System.out.printf("결과: %d\n", num/3);
//		} else {
//			System.out.printf("결과: %d\n", num/3 + 1);
//		}
		
		
		
		// 예제
		/*
		 * int score = 90; if(score >= 90) { System.out.println("A"); } else if(score >=
		 * 80) { System.out.println("B"); } else if(score >= 70) {
		 * System.out.println("C"); } else if(score >= 60) { System.out.println("D"); }
		 * else { System.out.println("F"); }
		 */
		
		
		// 연습문제
		// 전기를 많이 사용하면 누진율 적용 --> 단가와 기본요금 상승
		// 전기요금 = 기본요금 + 사용량 * 단가
		/*
		System.out.print("전기 사용량을 입력하세요 --> ");
		double usage = scan.nextDouble();
		int base; // 기본 요금
		double unitPrice; // 단가
		double fee; // 전기 요금
		
		if(usage <= 200) {
			unitPrice = 99.3;
			base = 910;
		} else if(usage <= 400) {
			unitPrice = 187.9;
			base = 1600;
		} else {
			unitPrice = 280.6;
			base = 7300;
		}
		fee = base + (usage * unitPrice);
		
		System.out.printf("사용량: %.1f kwh\n", usage);
		System.out.printf("기본 요금: %d 원\n", base);
		System.out.printf("단가: %.1f 원\n", unitPrice);
		System.out.printf("전기 요금: %.1f 원\n", fee);
		
		*/
		
		// 연습문제
		// 생존율 출력 프로그램
		/*
		System.out.print("최초 장비를 사용하기까지 걸린 시간을 입력하세요 --> ");
		int time = scan.nextInt();
		String life;
		
		if(time < 60) {
			life = "85%";
		} else if(time < 120) {
			life = "76%";
		} else if(time < 180) {
			life = "66%";
		} else if(time < 240) {
			life = "57%";
		} else if(time < 300) {
			life = "47%";
		} else {
			life = "25% 미만";
		}
		
		System.out.printf("생존율: %s\n", life);
		*/
		
		/*
		if(나이 > 19) {
			if(성별 == 남자) {
				// 군대
			} else {
				// 군대를 가지 않을 수 있다.
			}
			
		} else {
			
		}
		*/
		
		
		// 예제
		// 버스 전용차로 단속 프로그램
		/*
		System.out.println("1. 월~금, 2. 토요일, 3. 공휴일");
		System.out.print("요일을 선택하세요(1~3) --> ");
		
		int day = scan.nextInt();
		if(day == 1) { // 단속일
			System.out.println("버스 전용차로 단속 중입니다.");
			System.out.println("1. 버스, 2. 승용차");
			System.out.print("차종을 선택하세요(1, 2) --> ");
			
			int car = scan.nextInt();
			if(car == 1) {
				System.out.println("버스임");
			} else {
				System.out.println("버스 전용차로 위반!!");
			}
			
		} else { // 단속일x
			System.out.println("토요일, 공휴일은 단속하지 않아요~");
		}
		*/
		
		// 연습문제
		// 출생 연도를 입력하면 다음 요구사항에 맞춰 마스크 구매 가능한 요일을 출력하는 프로그램
		System.out.print("출생년도를 입력하세요 --> ");
		int birth = scan.nextInt();
		if(2021-birth >= 65) {
			System.out.println("언제든 구매 가능");
		} else {
			int buy = birth%10;
			if(buy == 1 || buy == 6) {
				System.out.println("월요일");
			} else if(buy == 2 || buy == 7) {
				System.out.println("화요일");
			} else if(buy == 3 || buy == 8) {
				System.out.println("수요일");
			} else if(buy == 4 || buy == 9) {
				System.out.println("목요일");
			} else if(buy == 5 || buy == 0) {
				System.out.println("금요일");
			}
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
