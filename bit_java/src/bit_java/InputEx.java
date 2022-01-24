package bit_java; // 패키지 선언문 --> 프로그램 코드에서 가장 첫 줄에 와야 함

import java.util.Scanner; // ctrl + shift + o
//import java.util.Scanner; // 임포트문, 클래스 영역 바깥에 있음

public class InputEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 타입의 객체를 참조하는 변수 scan
//		System.out.print("정수를 입력하세요 >> ");
		//scan.
//		int num = scan.nextInt(); // 입력장치로부터 정수를 읽어옴
//		System.out.printf("입력받은 수는 %d\n", num);
		
//		System.out.printf("입력받은 수는 %d", scan.nextInt());
//		System.out.printf("입력받은 수는 %d", scan.nextInt());
//		System.out.printf("입력받은 수는 %d", scan.nextInt());
//		System.out.printf("입력받은 수는 %d", scan.nextInt());
		
//		System.out.print("정수를 입력하세요 >> ");
//		int num2 = scan.nextInt();
//		System.out.printf("입력받은 수는 %d\n", num2);	
		
		// 이름(String), 주소(String), 나이(int), 키(double)를 키보드에서 입력받으려고 함
		// 키 입력을 공백 단위로 구분
//		System.out.println("이름(문자열) 주소(문자열) 나이(정수) 키(실수) 순서대로 입력하세요");
//		String name = scan.next(); // 이름
//		String addr = scan.next(); // 주소
//		int age = scan.nextInt(); // 나이
//		double height = scan.nextDouble(); // 키
//		System.out.println(name + ' ' + addr + ' ' + age + ' ' + height);
//		System.out.printf("이름 : %s, 주소 : %s, 나이: %d, 키: %.1f\n", name, addr, age, height);
		
		// 예제
//		System.out.print("당신의 이름을 입력하세요-->> ");
//		String name = scan.next();
//		System.out.print("당신의 주소를 입력하세요-->> ");
//		String addr = scan.next();
//		System.out.print("당신의 나이를 입력하세요-->> ");
//		int age = scan.nextInt();
//		System.out.print("당신의 키(cm)를 입력하세요-->> ");
//		double height = scan.nextDouble();
//		
//		System.out.printf("이름: %s\n", name);
//		System.out.printf("주소: %s\n", addr);
//		System.out.printf("나이: %d\n", age);
//		System.out.printf("키: %.1f\n", height);
		
		
		int a, b = 4;
		//a = b++ + 10; // 덧셈을 한 다음, b가 1 증가
		//System.out.printf("a : %d, b : %d\n", a, b);
		//a = ++b + 10; // b가 1 증가한 다음, 덧셈
		//System.out.printf("a : %d, b : %d\n", a, b);
		
		// 예제
//		int opr = 0;
//		opr += 3;
//		System.out.println(opr++);
//		System.out.println(opr);
//		System.out.println(++opr);
//		System.out.println(opr);
//		System.out.println(opr--);
//		System.out.println(opr);		
//		System.out.println(--opr);
//		System.out.println(opr);
		
		
//		System.out.println(1+1); // 2
//		System.out.println("1+1 = " + 1+1); // 1+1 = 11
//		System.out.println("1+1 = " + (1+1)); // 1+1 = 2
		
		// 예제
		
		// BMI
//		System.out.print("몸무게(kg): ");
//		double weight = scan.nextDouble();
//		System.out.print("신장(m): ");
//		double height = scan.nextDouble();
//		int bmi = (int) (weight/(height*height));
//		System.out.printf("BMI: %d\n", bmi);
		
		// 빵 나눠주기
//		int stu = 97/3;
//		System.out.printf("빵을 나누어 줄 수 있는 학생의 수: %d\n", stu);
//		int rest = 97%3;
//		System.out.printf("남는 빵 개수: %d\n", rest);
		
		
		// 연습문제
		// 키보드로 입력받은 정수는 시간단위의 초에 해당하고, 그 시간이 몇 시간, 몇 분, 몇 초에 해당하는지 
		// 계산한 다음 예시와 같이 출력하는 프로그램을 작성하기
		// 일 단위로 넘어가는 경우 발생x
		System.out.print("시간을 초단위로 입력하세요: ");
		int time = scan.nextInt();
		int hour = time/3600;
		int minute = time%3600/60;
		int second = time%3600%60;
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.\n", time, hour, minute, second);
		
		
		
		// 놀이동산1
		// 놀이동산2
		
		
		
		scan.close(); // 스캐너를 다 사용한 다음에 자원을 해제
		
	}

}
