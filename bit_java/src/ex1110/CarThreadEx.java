package ex1110;

import java.util.Random;

class SharedCar {
	public synchronized void drive(String name, String destination) {
		System.out.println(name + "님이 공유차에 탔음");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(3) + 1; i++) {
			System.out.println(name + "님이 공유차를 운전중");
		}
		System.out.println(name + "님이 " + destination + "에 도착했음");
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
		new CarThread("코난", car, "서울").start();
		new CarThread("장미", car, "부산").start();
		new CarThread("미란", car, "대전").start();
	}

}
