package bit_java; // ��Ű�� ���� --> ���α׷� �ڵ忡�� ���� ù �ٿ� �;� ��

import java.util.Scanner; // ctrl + shift + o
//import java.util.Scanner; // ����Ʈ��, Ŭ���� ���� �ٱ��� ����

public class InputEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ��ĳ�� Ÿ���� ��ü�� �����ϴ� ���� scan
//		System.out.print("������ �Է��ϼ��� >> ");
		//scan.
//		int num = scan.nextInt(); // �Է���ġ�κ��� ������ �о��
//		System.out.printf("�Է¹��� ���� %d\n", num);
		
//		System.out.printf("�Է¹��� ���� %d", scan.nextInt());
//		System.out.printf("�Է¹��� ���� %d", scan.nextInt());
//		System.out.printf("�Է¹��� ���� %d", scan.nextInt());
//		System.out.printf("�Է¹��� ���� %d", scan.nextInt());
		
//		System.out.print("������ �Է��ϼ��� >> ");
//		int num2 = scan.nextInt();
//		System.out.printf("�Է¹��� ���� %d\n", num2);	
		
		// �̸�(String), �ּ�(String), ����(int), Ű(double)�� Ű���忡�� �Է¹������� ��
		// Ű �Է��� ���� ������ ����
//		System.out.println("�̸�(���ڿ�) �ּ�(���ڿ�) ����(����) Ű(�Ǽ�) ������� �Է��ϼ���");
//		String name = scan.next(); // �̸�
//		String addr = scan.next(); // �ּ�
//		int age = scan.nextInt(); // ����
//		double height = scan.nextDouble(); // Ű
//		System.out.println(name + ' ' + addr + ' ' + age + ' ' + height);
//		System.out.printf("�̸� : %s, �ּ� : %s, ����: %d, Ű: %.1f\n", name, addr, age, height);
		
		// ����
//		System.out.print("����� �̸��� �Է��ϼ���-->> ");
//		String name = scan.next();
//		System.out.print("����� �ּҸ� �Է��ϼ���-->> ");
//		String addr = scan.next();
//		System.out.print("����� ���̸� �Է��ϼ���-->> ");
//		int age = scan.nextInt();
//		System.out.print("����� Ű(cm)�� �Է��ϼ���-->> ");
//		double height = scan.nextDouble();
//		
//		System.out.printf("�̸�: %s\n", name);
//		System.out.printf("�ּ�: %s\n", addr);
//		System.out.printf("����: %d\n", age);
//		System.out.printf("Ű: %.1f\n", height);
		
		
		int a, b = 4;
		//a = b++ + 10; // ������ �� ����, b�� 1 ����
		//System.out.printf("a : %d, b : %d\n", a, b);
		//a = ++b + 10; // b�� 1 ������ ����, ����
		//System.out.printf("a : %d, b : %d\n", a, b);
		
		// ����
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
		
		// ����
		
		// BMI
//		System.out.print("������(kg): ");
//		double weight = scan.nextDouble();
//		System.out.print("����(m): ");
//		double height = scan.nextDouble();
//		int bmi = (int) (weight/(height*height));
//		System.out.printf("BMI: %d\n", bmi);
		
		// �� �����ֱ�
//		int stu = 97/3;
//		System.out.printf("���� ������ �� �� �ִ� �л��� ��: %d\n", stu);
//		int rest = 97%3;
//		System.out.printf("���� �� ����: %d\n", rest);
		
		
		// ��������
		// Ű����� �Է¹��� ������ �ð������� �ʿ� �ش��ϰ�, �� �ð��� �� �ð�, �� ��, �� �ʿ� �ش��ϴ��� 
		// ����� ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��ϱ�
		// �� ������ �Ѿ�� ��� �߻�x
		System.out.print("�ð��� �ʴ����� �Է��ϼ���: ");
		int time = scan.nextInt();
		int hour = time/3600;
		int minute = time%3600/60;
		int second = time%3600%60;
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�.\n", time, hour, minute, second);
		
		
		
		// ���̵���1
		// ���̵���2
		
		
		
		scan.close(); // ��ĳ�ʸ� �� ����� ������ �ڿ��� ����
		
	}

}
