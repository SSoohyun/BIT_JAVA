package ex1103;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// getter/setter: alt + shift + s + r
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return 12*salary;
	}
	
	public int raiseSalary(int percent) {
		return salary * percent/100 ;
	}
	
	public String toString() {
		return String.format("Employee[id=%d, name=%s, salary=%d]", id, name, salary);
		// return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class EmployeeEx {

	public static void main(String[] args) {
//		Employee e1 = new Employee(1, "conan", 100000);
//		System.out.println(e1);
		
		Scanner scan = new Scanner(System.in);
		
		Employee[] ep = new Employee[3]; // 객체 배열 생성
		for(int i=0; i<ep.length; i++) {
			// 객체 생성, 생성자에서 모든 필드를 초기화
			ep[i] = new Employee(scan.nextInt(), scan.next(), scan.nextInt());
		}
		

//		// 출력
//		int percent = 10; // 월급 인상률
//		for(Employee e : ep) {
//			System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n", e, e.getAnnualSalary(), e.raiseSalary(percent));
//			percent += 10;
//		}
		
		// 출력
		for(int i=0; i<ep.length; i++) {
			System.out.printf("%s의 연봉은 %d 월급 인상분은 %d\n"
							, ep[i]
							, ep[i].getAnnualSalary()
							, ep[i].raiseSalary((i+1)*10));
		}
		
	}

}
