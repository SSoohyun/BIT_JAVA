package ex1104;

abstract class Car {
	Car() {
		System.out.println("Car ��ü ����");
	}
	
	// �߻� �޼ҵ� ����
	abstract void run();
	
	void start() {
		System.out.println("�õ��� �Ǵ�.");
	}
}

class Porche extends Car {
	// �߻� �޼ҵ� ����
	void run() {
		System.out.println("�����ΰ� �޸���.");
	}
}

public class A {

	public static void main(String[] args) {
		// �θ� ���� -> �ڽ� ����
		Car car = new Porche(); // upcasting
		
		car.start();
		car.run(); // �������̵�
	}

}
