package ex1105;

public class DivideEx {

	public static void main(String[] args) {
		
		int cnt = 0;
		int n=1;
		for(int num=2; num<=1000; num++) {
			int i;
			for(i=3; i<num; i+=2) {
				if(num%i == 0) {
					cnt++;
					break;	
				}
			}
			
			if(num == 2) {
				System.out.printf("%d번째 소수는 %d\n", n, num);
				n++;
			}
			
			if(num == i) {
				System.out.printf("%d번째 소수는 %d\n", n, num);
				n++;
			}
		}
		System.out.printf("나눗셈을 실행한 횟수 %d", cnt);
	}

}
