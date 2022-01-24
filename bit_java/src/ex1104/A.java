package ex1104;

abstract class Car {
	Car() {
		System.out.println("Car 객체 생성");
	}
	
	// 추상 메소드 선언
	abstract void run();
	
	void start() {
		System.out.println("시동을 건다.");
	}
}

class Porche extends Car {
	// 추상 메소드 구현
	void run() {
		System.out.println("포르셰가 달린다.");
	}
}

public class A {

	public static void main(String[] args) {
		// 부모 생성 -> 자식 생성
		Car car = new Porche(); // upcasting
		
		car.start();
		car.run(); // 오버라이딩
	}

}
