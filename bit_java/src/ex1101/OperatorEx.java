package ex1101;

import java.util.Scanner; // Ctrl + Shift + o

public class OperatorEx { // Ŭ���� ����

	public static void main(String[] args) { // ���� �޼ҵ� ����
		int a = 3;
		int b = 5;
		boolean result = a < b; // --> true or false
		// System.out.println(result); // true
		
		// ũ�� �� �����ڴ� �⺻������ ��� ���� (boolean ����)
		// System.out.println('a' > 'b'); // char (97>98) --> false
		// System.out.println("a" > "b"); // �⺻���� �ƴ� ���������� �Ұ���
		// System.out.println(true > false); // �Ұ���
		// System.out.println("a" == "b"); // ���� �񱳴� ��� Ÿ�Կ� ��� ����
		
		
		// ���� (���̵���)
		Scanner scan = new Scanner(System.in);
//		System.out.print("����� ����(cm)�� �Է��ϼ���: ");
//		System.out.println(scan.nextInt() >= 125);
		
		// System.out.println((3<=5) && (1<0)); // ���������� ��ġ�ϴ°�, ��й�ȣ�� ��ġ�ϴ°�...
		
		
		// ����
//		System.out.print("����� ����(cm)�� �Է��ϼ���: ");
//		int height = scan.nextInt();
//		System.out.println((height>=125) && (height<165));


//		System.out.println((3==5) || (1<0)); // or ������: �ǿ����� �� �� ������ ��쿡 ����
//		System.out.println(!((3==5) || (1<0))); // true
		
		// ���� ������
		int x = 1; int y = 2;
		int s = (x>y) ? 1 : -1; // x>y�� ���̸� ����� 1, �����̸� -1
		// System.out.println(s); // -1
		s = !(x>y) ? 1 : -1;
		// System.out.println(s); // 1
		
		
		// ��������
		// �ؼ��鿡�� 10m ������ ������ ������ 0.7���� �������ٰ� ������ ��
		// ������ �Է��ϸ� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		// �ؼ����� �µ��� 20��
//		System.out.print("������ �Է��ϼ���: ");
//		double depth = scan.nextDouble();
//		double temp = 20 - (0.7*(int)(depth/10));
//		System.out.printf("����: %.1f\n", temp);
//		System.out.println((int)depth/10); // int������ ������� double������ ������ ���� �˱�
		
		
		
		// ��������
		// 3���� ��ǻ�ͷ� 8�ð��� ���ϸ� �Ϸ� ������ ó���� �� �ִ�.
		// ���� �ٹ��� �ϰ� �Ǿ� �ٹ� �ð��� �پ���.
		// �ٹ� �ð��� �Է��ϸ� �ʿ��� ��ǻ�� ������ �ľ��ϴ� ���α׷� �ۼ��ϱ�
		System.out.print("�ٹ��ð��� �Է��Ͻÿ� --> ");
		double hour = scan.nextDouble();
		double comp = 24%hour==0 ? 24/hour : (int)(24/hour) + 1;
		System.out.printf("�ʿ��� ��ǻ�� ������ %.0f\n", comp);
		
		
		scan.close();
		
	} // ���� �޼ҵ� ��

} // Ŭ���� ��
