package hw1102;

import java.util.Scanner;

class Student {
	public String name; // 이름
	public int ban; // 반
	public int no; // 번호
	public int kor; // 국어
	public int eng; // 영어
	public int math; // 수학
	
	// 총점
	public int getTotal() {
		return kor+eng+math;
	}
	
	// 평균
	public double getAverage() {
		return (double)getTotal()/3;
	}
	
	// 학생 정보 출력
	public void showInfo() {
		System.out.printf("%s %d %d %d %d %d %d %.1f\n", name, ban, no, kor, eng, math, getTotal(), getAverage());
	}
}


public class StudentEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[3]; // 객체 배열 생성
	
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생 정보를 이름, 반, 번호, 국어, 영어, 수학 순서대로 입력하세요 -->> ");
			stu[i] = new Student(); // 객체 생성
			stu[i].name = scan.next();
			stu[i].ban = scan.nextInt();
			stu[i].no = scan.nextInt();
			stu[i].kor = scan.nextInt();
			stu[i].eng = scan.nextInt();
			stu[i].math = scan.nextInt();
		}
		
		// 출력
		System.out.println("=======================================================");
		System.out.println("학생이름 반 번호 국어 영어 수학 총점 평균");
		System.out.println("-------------------------------------------------------");
		
		for(int i=0; i<stu.length; i++) {
			stu[i].showInfo();
		}
		
		System.out.println("=======================================================");
	}

}
