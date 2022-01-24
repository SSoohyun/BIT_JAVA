package ex1101;

public class MethodEx {

//	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지의 합: %d\n", sum); // sum = 55
		
		sum = 0; // 초기화
		for(int i=10; i<=100; i++) {
			sum += i;
		}
		System.out.printf("10부터 100까지의 합: %d\n", sum);
		
		
		sum = 0; // 초기화
		for(int i=100; i<=1000; i++) {
			sum += i;
		}
		System.out.printf("100부터 1000까지의 합: %d\n", sum);
		*/
		
//	}
	
	public static void main(String[] args) { // caller
		sum(1, 10);
//		double result = sum(1, 10); // 호출(call)
//		System.out.println(result);
//		System.out.println("합(1~10) : " + sum(1, 10)); // 필요한 곳에서 호출 (1부터 10까지 합을 계산 후 반환해달라)
//		result = sum(10, 100);
//		System.out.println(result);
//		System.out.println("합(10~100) : " + sum(10, 100));
	}
	
	
	// sum method
	public static void sum(int i1, int i2) { // i1, i2는 매개변수 --> 메소드 정의, callee
		int sum = 0;
		for(int i=i1; i<=i2; i++) { 
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합: %d\n", i1, i2, sum);
//		return sum; // 결과값은 sum에 저장되어 있고 sum을 반환
	}
	

}
