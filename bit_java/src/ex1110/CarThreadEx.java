package ex1110;

import java.util.Random;

class SharedCar {
	public synchronized void drive(String name, String destination) {
		System.out.println(name + "���� �������� ����");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(3) + 1; i++) {
			System.out.println(name + "���� �������� ������");
		}
		System.out.println(name + "���� " + destination + "�� ��������");
	}
}

class CarThread extends Thread {
	private String driver;
	private SharedCar car;
	private String destination;
	
	public CarThread(String driver, SharedCar car, String destination) {
		super();
		this.driver = driver;
		this.car = car;
		this.destination = destination;
	}
	
	@Override
	public void run() {
		car.drive(driver, destination);
	}
	
}

public class CarThreadEx {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("�ڳ�", car, "����").start();
		new CarThread("���", car, "�λ�").start();
		new CarThread("�̶�", car, "����").start();
	}

}
