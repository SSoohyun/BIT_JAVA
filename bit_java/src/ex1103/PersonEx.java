package ex1103;

class Person {
	public void speak() {
		System.out.println("���ϱ�");
	}
	
	public void eat() {
		System.out.println("�Ա�");
	}
	
	public void walk() {
		System.out.println("�ȱ�");
	}
}

class Student extends Person {
	/*
	 * public void speak() { System.out.println("���ϱ�"); }
	 * 
	 * public void eat() { System.out.println("�Ա�"); }
	 * 
	 * public void walk() { System.out.println("�ȱ�"); }
	 */
	
	public void study() {
		System.out.println("�����ϱ�");
	}
}

class StudentWorker extends Student {
	/*
	 * public void speak() { System.out.println("���ϱ�"); }
	 * 
	 * public void eat() { System.out.println("�Ա�"); }
	 * 
	 * public void walk() { System.out.println("�ȱ�"); }
	 * 
	 * public void study() { System.out.println("�����ϱ�"); }
	 */
	
	public void work() {
		System.out.println("���ϱ�");
	}
}

class Researcher extends Person {
	public void research() {
		System.out.println("�����ϱ�");
	}
}

class Professor extends Researcher {
	public void teach() {
		System.out.println("����ġ��");
	}
}

public class PersonEx {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();
		
		StudentWorker sw = new StudentWorker();
		sw.eat();
		sw.study();
		sw.work();
		
	}

}
