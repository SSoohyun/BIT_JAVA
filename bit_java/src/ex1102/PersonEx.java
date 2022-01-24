package ex1102;

class Person {
	// field
	public int age;
	public String name;
	
	// constructor
	// 생성자도 오버로딩 가능
	public Person() { // 매개변수가 없는 생성자: 기본 생성자(default constructor)
	
	}
	public Person(String name) { // 매개변수가 있는 생성자
		this.name = name;
	}
	
	// method
	public String getName() {
		return this.name;
	}

}

public class PersonEx {

	public static void main(String[] args) {
		// 인스턴스화
		/*
		Person aPerson;
		aPerson = new Person(); // new와 함께 생성자 호출, 참조 변수가 필요
								// 이름, 나이 지정하지 않음
		
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
//		
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		System.out.println("이름, 나이 지정 후");
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
		
		
		
		Person anotherPerson;
		anotherPerson = new Person("rose");
		
		System.out.println(anotherPerson.age); // 0
		System.out.println(anotherPerson.name); // rose
		System.out.println(anotherPerson.getName());
		
		anotherPerson.age = 17;
	
		System.out.println("나이 지정 후");
		System.out.println(anotherPerson.age); // 17
		System.out.println(anotherPerson.name); // rose
		System.out.println(anotherPerson.getName());
		*/
		
		// 객체 배열
		/*
		Person[] pa; // 객체 배열 참조변수 선언
		pa = new Person[3]; // 객체 배열 생성, null
		
		pa[0] = new Person(); // Person 객체 생성 --> new와 함께 생성자 호출 --> age, name: 0, null
		pa[1] = new Person(); // Person 객체 생성 --> new와 함께 생성자 호출 --> age, name: 0, null
		pa[2] = new Person(); // Person 객체 생성 --> new와 함께 생성자 호출 --> age, name: 0, null
		
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		
		pa[0].age = 10;
		pa[0].name = "conan";
		
		System.out.println("이름, 나이 설정 후");
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		*/
		
		Person[] pa; 
		pa = new Person[5]; // 배열 객체 생성
		
		for(int i=0; i<pa.length; i++) {
			pa[i] = new Person(); // Person 객체 생성
			pa[i].age = 30 + i;
		}
		
		for(int i=0; i<pa.length; i++) {
			System.out.print(pa[i].age + " ");
		}
		
		System.out.println();
		
		for(Person aPerson : pa) {
			System.out.print(aPerson.age + " ");
		}
		
		
		
		
	}

}
