package hw1102;

import java.util.Scanner;

class Student {
	public String name; // �̸�
	public int ban; // ��
	public int no; // ��ȣ
	public int kor; // ����
	public int eng; // ����
	public int math; // ����
	
	// ����
	public int getTotal() {
		return kor+eng+math;
	}
	
	// ���
	public double getAverage() {
		return (double)getTotal()/3;
	}
	
	// �л� ���� ���
	public void showInfo() {
		System.out.printf("%s %d %d %d %d %d %d %.1f\n", name, ban, no, kor, eng, math, getTotal(), getAverage());
	}
}


public class StudentEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[3]; // ��ü �迭 ����
	
		for(int i=0; i<stu.length; i++) {
			System.out.println("�л� ������ �̸�, ��, ��ȣ, ����, ����, ���� ������� �Է��ϼ��� -->> ");
			stu[i] = new Student(); // ��ü ����
			stu[i].name = scan.next();
			stu[i].ban = scan.nextInt();
			stu[i].no = scan.nextInt();
			stu[i].kor = scan.nextInt();
			stu[i].eng = scan.nextInt();
			stu[i].math = scan.nextInt();
		}
		
		// ���
		System.out.println("=======================================================");
		System.out.println("�л��̸� �� ��ȣ ���� ���� ���� ���� ���");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0; i<stu.length; i++) {
			stu[i].showInfo();
		}
		
		System.out.println("=======================================================");
	}

}
