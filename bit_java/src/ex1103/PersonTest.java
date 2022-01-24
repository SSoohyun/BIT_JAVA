package ex1103;

class Person {
	private String name;
	private String addr;
	
	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return String.format("Person[name=%s, address=%s]", name, addr);
	}
}

class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String addr, String program, int year, double fee) {
		super(name, addr);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return String.format("Student[%s, program=%s, year=%d, fee=%.1f]", super.toString(), program, year, fee);
	}
	
}

class Staff extends Person {
	private String school;
	private double pay;
	
	
	public Staff(String name, String addr, String school, double pay) {
		super(name, addr);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return String.format("Staff[%s, school=%s, pay=%.1f]", super.toString(), getSchool(), getPay());
	}

}

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("코난", "미란이네");
		System.out.println(p);
		
		// 단순 객체 생성
//		Student s1 = new Student("장미", "브라운 박사님댁", "생명과학", 1, 25000);
//		Student s2 = new Student("미란", "미란이네", "태권도", 3, 3000);
//		System.out.println(s1);
//		System.out.println(s2);
		
		// 객체 배열 생성
		Student[] s = new Student[2];
		s[0] = new Student("장미", "브라운 박사님댁", "생명과학", 1, 25000);
		s[1] = new Student("미란", "미란이네", "태권도", 3, 3000);
		for(Student st : s) {
			System.out.println(st);
		}
		
		Staff sf = new Staff("유명한", "미란이네", "청솔대학", 20);
		System.out.println(sf);

	}

}
