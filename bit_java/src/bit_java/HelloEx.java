package bit_java;
// �ĺ��� ��� ��Ģ�� ����
// ��� ���� Ŭ���� �ȿ� �־�� �� 
public class HelloEx { // Ŭ���� �̸��� �빮�ڷ� �����϶�� ����o
	// Ŭ���� �̸��� �����Ǵ� �ҽ� �ڵ� �̸��� ���� (��� ��쿡 �ش��ϴ� ��x)
	
	public int getAge1() { return 0;}
	
	public static void main(String[] args) { // ���� �޼ҵ� ����
//		/*
//		int age; // ���� �̸� age���� int���� �����ؼ� ����� ����: ������ ����
//		// System.out.println(age); // ���� ���� �� �ʱ�ȭ�� �ʿ�
//		
//		age = 10; // 10�̶�� ���� age��� �̸��� �޸� ������ ����: write --> ���� ���ʷ� ����: �ʱ�ȭ
//		*/
//		/* final */ int age = 10; // �� �ٷε� �ۼ� ����, ����� ����
//		
//		
//		// System.out.println(age); // age��� ������ ����� ���� �о�ͼ� �ý��۰� ����� �����ġ�� ����϶�: read
//		
//		/*
//		age = 020; // ���ڰ� 0���� �����ϸ� 8����
//		age = 0x20; // ���ڰ� 0x�� �����ϸ� 16����
//		// System.out.println(age);
//		
//		long lightSpeed = 3000000L; // ���̻簡 L, l�� ������ long Ÿ��
//		// �ڹٿ��� ������ �⺻�� int
//		
//		double half = 0.5;
//		half = 2E-1; // 2*10^-1
//		// System.out.println(half);
//		// double pi = 3.141592;
//		float pi = 3.141592F; // �ڹٿ��� �Ǽ��� �⺻�� double��
//		// ���̻簡 F, f�� ������ float Ÿ��
//		
//		boolean isEmpty = true; // boolean�� �� �Ǵ� ������ �����ϴ� ������ Ÿ��
//		boolean isFull = false;
//		// System.out.println(isFull);
//		// isFull = 100; // Ÿ�� ����
//		
//		char c1 = 'a'; // ���� �� ���� ' '���ο� �ۼ�
//		// char c2 = "A"; // "" --> ���ڿ�(������ ������ 0 ~ ����) ������ ����: String Ÿ������ ����
//		String c2 = "Aaaa";
//		char c3 = 48; // �ƽ�Ű �ڵ�
//		char c4 = '\t'; // ���� Ȥ�� ���ڿ� ���ο��� \�� ������ �ٸ� ����� �ϰ� �Ǿ����� --> ���ڿ� Ż���ؼ� tab��ŭ ���� ���
//		char c5 = '\n'; // new line --> ���ο� �ٷ�
//		// Ű���忡 �ִ� ���ڵ��� ���������δ� ��ȣȭ�Ǿ� ó���� --> ASCII
//		System.out.println(c3);
//			
//		boolean isEmptyTrue;
//		boolean isempty;
//		String strName; // strName�̶�� �̸��� ������ ���ڿ�(String)�� ����
//		
//		int numberOne = 1; // �Ϲ����� ���� --> �ٲ� �� ����
//		final int NUMBER_ONE = 1; // ���α׷� ���� ������ �ٲ��� ����: ���
//		final double PI = 3.141592;
//		
//		*/
//		
//		//public int getAge() {} //getAge��� �̸��� �޼ҵ� ����, �ٸ� �޼ҵ� ���ο��� �޼ҵ� ���� �Ұ�
//		
//		
//		
//		// �⺻��: int, double, char, boolean, short, byte, long, float
//		// ������ reference
//		
//		// ���ڿ� ���ͷ�
//		// System.out.print("Good\t"); // print: �ٹٲ�x, println: ����� �ٹٲ�
//		// System.out.print("\"morning\n"); // ", \ �� ����ϰ� ������ \ + (" or \)�� �ۼ�
//		
//		String str1 = "Good";
//		String str2 = "morning";
//		// System.out.println("������ ���� ���");
//		// System.out.println(str1);
//		// System.out.println(str2);
//		
//		String str = null; // �ƹ��͵� ����x, null�� ����Ÿ�Կ��� ��� ����
//		// int num = null; // �Ұ���
//		
//		
//		
//		
//		/* final */ int value; // ������ ����
//		value = 20;
//		int result = value+10; // ��ȣ�� �������� ������ ���� ����
//		System.out.println(value); // �ʱ�ȭ���� ���� �������� �о���� ���� �Ұ���
//		System.out.println(result);
//		value = 30;
//		
//		// ������� ��: �޸� �� ������ ���� �� ������ ���� �̸�
//		{
//			int num = 1;
//			System.out.print("num: ");
//			System.out.println(num);
//		} // num�� �� �̻� �������� ����	
//		//System.out.println(num);
//		
//		/*
//		 * value = 30; System.out.println(value);
//		 */
//		
//		double d1 = 5*3.14; // 5 --> 5.0 --> 5.0*3.14 --> ����� d1�� ����
//		// �ڵ� ����ȯ�� Ŀ���� �������� �߻�
//		double d2 = 1; // promotion
//		System.out.print("d2: ");
//		System.out.println(d2);
//		
//		float f = 3.14F;
//		float f2 = (float)3.14; // �����Ͱ� �߷������� �κ�o --> ���� ����ȯ(casting) �߻�
//		double d = (float)3.14f;
//		System.out.println(1/2.); // ���� ������ ���� --> ����
		
		// ����ڰ� ���ϴ� �����͸� �Է¹޾�.. ���μ��� ���
		int age = 10;
		String name = "�ڳ�";
		// ��ġ�� �� --> + --> ���ڿ��� ���, ������ ��� ����� �ٸ� �� ����
		System.out.print("���� : ");
		System.out.print(age+"\n");
		System.out.print("���� : " + age + "\n"); // ���ڿ� + ���� --> ���ڿ�
		System.out.printf("���� : %d\n", age);
		System.out.println();
		System.out.printf("���� : %d\n�̸� : %s\n", 18, "���");
		
//		System.out.print("�̸� : ");
//		System.out.print(name);
//		System.out.print("���� Ž������.");
		
		int x = 5;
		double pi = 3.14;
		System.out.printf("x : %d\n", x); 
		System.out.printf("x : %5d\n", x); // �ټ� �ڸ��� Ȯ���� �Ŀ� ������ ����
		System.out.printf("x : %05d\n", x); // �ټ� �ڸ��� Ȯ���� �Ŀ� �� �ڸ� 0���� ä��
		System.out.printf("pi : %f\n", pi);
		System.out.printf("pi : %7.1f\n", pi); // 7�ڸ� �߿� �Ҽ��� 1�ڸ�
		System.out.printf("pi : %7.3f\n", pi);
		System.out.printf("%s\n", "Hi ~ Java");
		System.out.printf("%20s\n", "Hi ~ Java");
//		System.out.print("x : " + x + " pi: "+ pi + "\n");
//		System.out.print("x : ");
//		System.out.print(x);
//		System.out.print(" pi : ");
//		System.out.print(pi);
//		System.out.printf("\nx = %d pi = %f\n", x, pi); // %d: ����, %f: �Ǽ�, %s: ���ڿ�, %c: ���� �ϳ�

		// ����
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
		
	} // ���� �޼ҵ� ��, ������ ���� ������ �����

	public int getAge2() { return 0;} // �ٸ� �޼ҵ� ���� �ٱ�, Ŭ���� ���ο� ���� ����
	public int getAge3() { return 0;}
	
}