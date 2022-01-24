package bit_java;
// 식별자 명명 규칙과 관례
// 모든 것은 클래스 안에 있어야 함 
public class HelloEx { // 클래스 이름을 대문자로 시작하라는 관례o
	// 클래스 이름과 생성되는 소스 코드 이름은 동일 (모든 경우에 해당하는 것x)
	
	public int getAge1() { return 0;}
	
	public static void main(String[] args) { // 메인 메소드 시작
//		/*
//		int age; // 변수 이름 age에는 int형만 저장해서 사용할 예정: 변수의 선언
//		// System.out.println(age); // 변수 선언 후 초기화가 필요
//		
//		age = 10; // 10이라는 값을 age라는 이름의 메모리 공간에 저장: write --> 값을 최초로 저장: 초기화
//		*/
//		/* final */ int age = 10; // 한 줄로도 작성 가능, 상수로 지정
//		
//		
//		// System.out.println(age); // age라는 변수에 저장된 값을 읽어와서 시스템과 연결된 출력장치에 출력하라: read
//		
//		/*
//		age = 020; // 숫자가 0으로 시작하면 8진수
//		age = 0x20; // 숫자가 0x로 시작하면 16진수
//		// System.out.println(age);
//		
//		long lightSpeed = 3000000L; // 접미사가 L, l로 끝나면 long 타입
//		// 자바에서 정수형 기본이 int
//		
//		double half = 0.5;
//		half = 2E-1; // 2*10^-1
//		// System.out.println(half);
//		// double pi = 3.141592;
//		float pi = 3.141592F; // 자바에서 실수형 기본은 double형
//		// 접미사가 F, f로 끝나면 float 타입
//		
//		boolean isEmpty = true; // boolean은 참 또는 거짓을 저장하는 데이터 타입
//		boolean isFull = false;
//		// System.out.println(isFull);
//		// isFull = 100; // 타입 오류
//		
//		char c1 = 'a'; // 문자 한 개만 ' '내부에 작성
//		// char c2 = "A"; // "" --> 문자열(문자의 개수가 0 ~ 무한) 구분자 역할: String 타입으로 지정
//		String c2 = "Aaaa";
//		char c3 = 48; // 아스키 코드
//		char c4 = '\t'; // 문자 혹은 문자열 내부에서 \를 만나면 다른 기능을 하게 되어있음 --> 문자열 탈출해서 tab만큼 공백 띄움
//		char c5 = '\n'; // new line --> 새로운 줄로
//		// 키보드에 있는 문자들은 내부적으로는 부호화되어 처리됨 --> ASCII
//		System.out.println(c3);
//			
//		boolean isEmptyTrue;
//		boolean isempty;
//		String strName; // strName이라는 이름의 변수를 문자열(String)로 선언
//		
//		int numberOne = 1; // 일반적인 변수 --> 바뀔 수 있음
//		final int NUMBER_ONE = 1; // 프로그램 영역 내에서 바뀌지 않음: 상수
//		final double PI = 3.141592;
//		
//		*/
//		
//		//public int getAge() {} //getAge라는 이름의 메소드 선언, 다른 메소드 내부에는 메소드 선언 불가
//		
//		
//		
//		// 기본형: int, double, char, boolean, short, byte, long, float
//		// 참조형 reference
//		
//		// 문자열 리터럴
//		// System.out.print("Good\t"); // print: 줄바꿈x, println: 출력후 줄바꿈
//		// System.out.print("\"morning\n"); // ", \ 등 출력하고 싶으면 \ + (" or \)로 작성
//		
//		String str1 = "Good";
//		String str2 = "morning";
//		// System.out.println("변수의 내용 출력");
//		// System.out.println(str1);
//		// System.out.println(str2);
//		
//		String str = null; // 아무것도 참조x, null은 참조타입에만 사용 가능
//		// int num = null; // 불가능
//		
//		
//		
//		
//		/* final */ int value; // 변수가 생김
//		value = 20;
//		int result = value+10; // 등호의 오른쪽의 연산을 먼저 실행
//		System.out.println(value); // 초기화하지 않은 변수값을 읽어오는 것은 불가능
//		System.out.println(result);
//		value = 30;
//		
//		// 변수라는 것: 메모리 상에 공간을 만들어서 그 공간에 붙인 이름
//		{
//			int num = 1;
//			System.out.print("num: ");
//			System.out.println(num);
//		} // num은 더 이상 존재하지 않음	
//		//System.out.println(num);
//		
//		/*
//		 * value = 30; System.out.println(value);
//		 */
//		
//		double d1 = 5*3.14; // 5 --> 5.0 --> 5.0*3.14 --> 결과를 d1에 저장
//		// 자동 형변환은 커지는 방향으로 발생
//		double d2 = 1; // promotion
//		System.out.print("d2: ");
//		System.out.println(d2);
//		
//		float f = 3.14F;
//		float f2 = (float)3.14; // 데이터가 잘려나가는 부분o --> 강제 형변환(casting) 발생
//		double d = (float)3.14f;
//		System.out.println(1/2.); // 정수 나누기 정수 --> 정수
		
		// 사용자가 원하는 데이터를 입력받아.. 프로세스 출력
		int age = 10;
		String name = "코난";
		// 합치는 것 --> + --> 문자열인 경우, 숫자인 경우 결과가 다를 수 있음
		System.out.print("나이 : ");
		System.out.print(age+"\n");
		System.out.print("나이 : " + age + "\n"); // 문자열 + 숫자 --> 문자열
		System.out.printf("나이 : %d\n", age);
		System.out.println();
		System.out.printf("나이 : %d\n이름 : %s\n", 18, "장미");
		
//		System.out.print("이름 : ");
//		System.out.print(name);
//		System.out.print("나는 탐정이죠.");
		
		int x = 5;
		double pi = 3.14;
		System.out.printf("x : %d\n", x); 
		System.out.printf("x : %5d\n", x); // 다섯 자리를 확보한 후에 오른쪽 정렬
		System.out.printf("x : %05d\n", x); // 다섯 자리를 확보한 후에 빈 자리 0으로 채움
		System.out.printf("pi : %f\n", pi);
		System.out.printf("pi : %7.1f\n", pi); // 7자리 중에 소수점 1자리
		System.out.printf("pi : %7.3f\n", pi);
		System.out.printf("%s\n", "Hi ~ Java");
		System.out.printf("%20s\n", "Hi ~ Java");
//		System.out.print("x : " + x + " pi: "+ pi + "\n");
//		System.out.print("x : ");
//		System.out.print(x);
//		System.out.print(" pi : ");
//		System.out.print(pi);
//		System.out.printf("\nx = %d pi = %f\n", x, pi); // %d: 정수, %f: 실수, %s: 문자열, %c: 문자 하나

		// 예제
		int i = 97;
		String s = "Java";
		double f = 3.14f;
		System.out.printf("%d\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", i);
		System.out.printf("%05d\n", i);
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
	} // 메인 메소드 끝, 변수를 위한 공간이 사라짐

	public int getAge2() { return 0;} // 다른 메소드 영역 바깥, 클래스 내부에 선언 가능
	public int getAge3() { return 0;}
	
}