package ex1101;

import java.util.Scanner; // Ctrl + Shift + o

public class OperatorEx { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		int a = 3;
		int b = 5;
		boolean result = a < b; // --> true or false
		// System.out.println(result); // true
		
		// 크기 비교 연산자는 기본형에만 사용 가능 (boolean 제외)
		// System.out.println('a' > 'b'); // char (97>98) --> false
		// System.out.println("a" > "b"); // 기본형이 아닌 참조형으로 불가능
		// System.out.println(true > false); // 불가능
		// System.out.println("a" == "b"); // 동등 비교는 모든 타입에 사용 가능
		
		
		// 예제 (놀이동산)
		Scanner scan = new Scanner(System.in);
//		System.out.print("어린이의 신장(cm)를 입력하세요: ");
//		System.out.println(scan.nextInt() >= 125);
		
		// System.out.println((3<=5) && (1<0)); // 유저네임이 일치하는가, 비밀번호가 일치하는가...
		
		
		// 예제
//		System.out.print("어린이의 신장(cm)를 입력하세요: ");
//		int height = scan.nextInt();
//		System.out.println((height>=125) && (height<165));


//		System.out.println((3==5) || (1<0)); // or 연산자: 피연산자 둘 다 거짓인 경우에 거짓
//		System.out.println(!((3==5) || (1<0))); // true
		
		// 조건 연산자
		int x = 1; int y = 2;
		int s = (x>y) ? 1 : -1; // x>y가 참이면 결과는 1, 거짓이면 -1
		// System.out.println(s); // -1
		s = !(x>y) ? 1 : -1;
		// System.out.println(s); // 1
		
		
		// 연습문제
		// 해수면에서 10m 내려갈 때마다 수온이 0.7도씩 내려간다고 가정할 때
		// 수심을 입력하면 수온을 계산하는 프로그램 작성하기
		// 해수면의 온도는 20도
//		System.out.print("수심을 입력하세요: ");
//		double depth = scan.nextDouble();
//		double temp = 20 - (0.7*(int)(depth/10));
//		System.out.printf("수온: %.1f\n", temp);
//		System.out.println((int)depth/10); // int에서의 나누기와 double에서의 나누기 차이 알기
		
		
		
		// 연습문제
		// 3대의 컴퓨터로 8시간을 일하면 하루 업무를 처리할 수 있다.
		// 단축 근무를 하게 되어 근무 시간이 줄었다.
		// 근무 시간을 입력하면 필요한 컴퓨터 수량을 파악하는 프로그램 작성하기
		System.out.print("근무시간을 입력하시오 --> ");
		double hour = scan.nextDouble();
		double comp = 24%hour==0 ? 24/hour : (int)(24/hour) + 1;
		System.out.printf("필요한 컴퓨터 수량은 %.0f\n", comp);
		
		
		scan.close();
		
	} // 메인 메소드 끝

} // 클래스 끝
