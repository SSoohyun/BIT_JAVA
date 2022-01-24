package ex1102;

class Person {
	// field
	public int age;
	public String name;
	
	// constructor
	// �����ڵ� �����ε� ����
	public Person() { // �Ű������� ���� ������: �⺻ ������(default constructor)
	
	}
	public Person(String name) { // �Ű������� �ִ� ������
		this.name = name;
	}
	
	// method
	public String getName() {
		return this.name;
	}

}

public class PersonEx {

	public static void main(String[] args) {
		// �ν��Ͻ�ȭ
		/*
		Person aPerson;
		aPerson = new Person(); // new�� �Բ� ������ ȣ��, ���� ������ �ʿ�
								// �̸�, ���� �������� ����
		
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
//		
//		aPerson.age = 10;
//		aPerson.name = "conan";
//		System.out.println("�̸�, ���� ���� ��");
//		System.out.println(aPerson.age);
//		System.out.println(aPerson.name);
//		System.out.println(aPerson.getName());
		
		
		
		Person anotherPerson;
		anotherPerson = new Person("rose");
		
		System.out.println(anotherPerson.age); // 0
		System.out.println(anotherPerson.name); // rose
		System.out.println(anotherPerson.getName());
		
		anotherPerson.age = 17;
	
		System.out.println("���� ���� ��");
		System.out.println(anotherPerson.age); // 17
		System.out.println(anotherPerson.name); // rose
		System.out.println(anotherPerson.getName());
		*/
		
		// ��ü �迭
		/*
		Person[] pa; // ��ü �迭 �������� ����
		pa = new Person[3]; // ��ü �迭 ����, null
		
		pa[0] = new Person(); // Person ��ü ���� --> new�� �Բ� ������ ȣ�� --> age, name: 0, null
		pa[1] = new Person(); // Person ��ü ���� --> new�� �Բ� ������ ȣ�� --> age, name: 0, null
		pa[2] = new Person(); // Person ��ü ���� --> new�� �Բ� ������ ȣ�� --> age, name: 0, null
		
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		
		pa[0].age = 10;
		pa[0].name = "conan";
		
		System.out.println("�̸�, ���� ���� ��");
		System.out.println(pa[0].age);
		System.out.println(pa[0].name);
		*/
		
		Person[] pa; 
		pa = new Person[5]; // �迭 ��ü ����
		
		for(int i=0; i<pa.length; i++) {
			pa[i] = new Person(); // Person ��ü ����
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
