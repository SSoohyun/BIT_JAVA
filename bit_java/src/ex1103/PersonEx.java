package ex1103;

class Person {
	public void speak() {
		System.out.println("말하기");
	}
	
	public void eat() {
		System.out.println("먹기");
	}
	
	public void walk() {
		System.out.println("걷기");
	}
}

class Student extends Person {
	/*
	 * public void speak() { System.out.println("말하기"); }
	 * 
	 * public void eat() { System.out.println("먹기"); }
	 * 
	 * public void walk() { System.out.println("걷기"); }
	 */
	
	public void study() {
		System.out.println("공부하기");
	}
}

class StudentWorker extends Student {
	/*
	 * public void speak() { System.out.println("말하기"); }
	 * 
	 * public void eat() { System.out.println("먹기"); }
	 * 
	 * public void walk() { System.out.println("걷기"); }
	 * 
	 * public void study() { System.out.println("공부하기"); }
	 */
	
	public void work() {
		System.out.println("일하기");
	}
}

class Researcher extends Person {
	public void research() {
		System.out.println("연구하기");
	}
}

class Professor extends Researcher {
	public void teach() {
		System.out.println("가르치기");
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
