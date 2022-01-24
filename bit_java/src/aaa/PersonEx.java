package aaa;

class Person {
	String name = "���";
	
	void showInfo() {
		System.out.println("���� " + name);
	}
}

class Student extends Person {
	String major = "��ǻ��";
	
	void work() {
		System.out.println(major + "�� �����Ѵ�.");
	}
	
	static void method(Person p) {
		Student s = (Student)p; // downcasting
		System.out.println("downcasting ����");
	}
}

public class PersonEx {

	public static void main(String[] args) {
		/*
		Student s = new Student(); // name, major / showInro(), work()
		// �θ� = �ڽ�
		Person p1 = s; // �ڵ� ����ȯ(��ĳ����), ������ �����ϳ� �ڽ� �޼ҵ峪 �ʵ�� ��� �Ұ�
		Person p2 = new Student(); // ��ĳ����
		
		p1.name = "�����";
//		p1.major = "����"; // �ڽ� ��� ���� �����ϴ� ���� �Ұ���!!
		s.major = "ȭ��"; // ����
		
		// ���� ����ȯ(�ٿ�ĳ����), �� ������ ���� �ƴ�
		// ��ĳ���õ� ���� ������� �ǵ����� ��!
//		Student s = new Person(); // �Ұ���, ������ �ڽ� = �θ� �ƴ�
		Student s1 = (Student)p1; // ���󺹱�
		s1.name = "�ڽ���";
		s1.major = "����";
		*/
		
		/*
		// instanceof: ������ ����Ű�� ��ü�� ��¥ Ÿ�� �ĺ�
		Person p1 = new Person();
		Student s2 = new Student();
		Person p2 = s2;
		Student s = (Student)p2;
		
		System.out.println(p1 instanceof Student); // false
		System.out.println(s2 instanceof Student); // true
		System.out.println(p2 instanceof Student); // true
		System.out.println(s instanceof Student); // true
		System.out.println(s instanceof Person); // true �ڽ��� �θ� ok
		*/
		
		
		// Ÿ�Ժ�ȯ
		Person p1 = new Person();
		Person p2 = new Student(); // upcasting
		// Student.method(p1); // �θ�� ��ü ���������Ƿ� downcasting �Ұ���
		Student.method(p2); // upcasting -> downcasting ����
		
	}

}
