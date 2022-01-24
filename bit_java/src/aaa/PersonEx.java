package aaa;

class Person {
	String name = "사람";
	
	void showInfo() {
		System.out.println("나는 " + name);
	}
}

class Student extends Person {
	String major = "컴퓨터";
	
	void work() {
		System.out.println(major + "를 공부한다.");
	}
	
	static void method(Person p) {
		Student s = (Student)p; // downcasting
		System.out.println("downcasting 실행");
	}
}

public class PersonEx {

	public static void main(String[] args) {
		/*
		Student s = new Student(); // name, major / showInro(), work()
		// 부모 = 자식
		Person p1 = s; // 자동 형변환(업캐스팅), 참조는 가능하나 자식 메소드나 필드는 사용 불가
		Person p2 = new Student(); // 업캐스팅
		
		p1.name = "새사람";
//		p1.major = "수학"; // 자식 멤버 값에 접근하는 것은 불가능!!
		s.major = "화학"; // 가능
		
		// 강제 형변환(다운캐스팅), 늘 가능한 것은 아님
		// 업캐스팅된 것을 원래대로 되돌리는 것!
//		Student s = new Person(); // 불가능, 무조건 자식 = 부모가 아님
		Student s1 = (Student)p1; // 원상복구
		s1.name = "자식임";
		s1.major = "수학";
		*/
		
		/*
		// instanceof: 참조가 가리키는 객체의 진짜 타입 식별
		Person p1 = new Person();
		Student s2 = new Student();
		Person p2 = s2;
		Student s = (Student)p2;
		
		System.out.println(p1 instanceof Student); // false
		System.out.println(s2 instanceof Student); // true
		System.out.println(p2 instanceof Student); // true
		System.out.println(s instanceof Student); // true
		System.out.println(s instanceof Person); // true 자식은 부모도 ok
		*/
		
		
		// 타입변환
		Person p1 = new Person();
		Person p2 = new Student(); // upcasting
		// Student.method(p1); // 부모로 객체 생성했으므로 downcasting 불가능
		Student.method(p2); // upcasting -> downcasting 가능
		
	}

}
