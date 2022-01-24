package ex1103;

class Vehicle {
	void run() { // default, package-friendly
		System.out.println("Ż ���� �޸���.");
	}
}

class Bike extends Vehicle {
	
	public void run() { // �������̵� --> ������, modifier�� �θ𺸴� ���� �� x
		System.out.println("�����Ű� ������ �Ÿ��� �޸���. (�������̵�)");
	}
	
	void run(String sound) { // �����ε� --> �ߺ�����
		System.out.printf("�����Ű� %s �Ÿ��� �޸���.\n", sound);
	}
	
	void stop() {
		System.out.println("�����Ÿ� �����.");
	}
}

public class VehicleEx {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		
		Vehicle v = new Bike(); // upcasting
		v.run(); // �θ��� run�� �ƴ� �������̵��� �ڽ��� run ����
//		v.stop(); // stop()�� �ڽ� �޼ҵ�� ���� �߻�
	}

}
