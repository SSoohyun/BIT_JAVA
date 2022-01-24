package ex1104;

// 추상 클래스
// 추상 메소드가 하나라도 있으면 추상 클래스로 선언해야 함 --> abstract 필수!!
abstract class Animal {
	// 여기서 구체화하는 것은 낭비
	// 자식에서만 구체화하면 됨
	/*
	 * public void makeSound() { System.out.println("소리를 낸다."); }
	 */
	
	// 추상 메소드: 키워드는 abstract, 본체(구현)가 없는 메소드
	abstract public void makeSound();
	
	// 추상 클래스 안에 일반 메소드 존재 가능
	public void eat() {
		System.out.println("냠냠");
	}
}

abstract class Shape {
	// 추상 메소드가 없더라도, abstract를 써서 추상 클래스로 선언 가능
}

abstract class Mouse extends Animal {
	// 부모의 추상 메소드를 구현하지 않는다면 자식도 추상 클래스로 선언해야 함
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("냐옹");
	}
}

public class AnimalEx {

	public static void main(String[] args) {
		
//		new Animal(); // 추상 클래스의 객체 생성 불가능
		
		Animal dog = new Dog(); // 추상 클래스의 레퍼런스는 선언 가능
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
	}

}
