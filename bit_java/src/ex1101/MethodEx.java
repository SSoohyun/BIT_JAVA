package ex1101;

public class MethodEx {

//	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.printf("1���� 10������ ��: %d\n", sum); // sum = 55
		
		sum = 0; // �ʱ�ȭ
		for(int i=10; i<=100; i++) {
			sum += i;
		}
		System.out.printf("10���� 100������ ��: %d\n", sum);
		
		
		sum = 0; // �ʱ�ȭ
		for(int i=100; i<=1000; i++) {
			sum += i;
		}
		System.out.printf("100���� 1000������ ��: %d\n", sum);
		*/
		
//	}
	
	public static void main(String[] args) { // caller
		sum(1, 10);
//		double result = sum(1, 10); // ȣ��(call)
//		System.out.println(result);
//		System.out.println("��(1~10) : " + sum(1, 10)); // �ʿ��� ������ ȣ�� (1���� 10���� ���� ��� �� ��ȯ�ش޶�)
//		result = sum(10, 100);
//		System.out.println(result);
//		System.out.println("��(10~100) : " + sum(10, 100));
	}
	
	
	// sum method
	public static void sum(int i1, int i2) { // i1, i2�� �Ű����� --> �޼ҵ� ����, callee
		int sum = 0;
		for(int i=i1; i<=i2; i++) { 
			sum += i;
		}
		System.out.printf("%d���� %d������ ��: %d\n", i1, i2, sum);
//		return sum; // ������� sum�� ����Ǿ� �ְ� sum�� ��ȯ
	}
	

}
