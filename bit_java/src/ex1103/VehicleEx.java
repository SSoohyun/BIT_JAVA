package ex1103;

class Vehicle {
	void run() { // default, package-friendly
		System.out.println("탈 것이 달린다.");
	}
}

class Bike extends Vehicle {
	
	public void run() { // 오버라이딩 --> 재정의, modifier가 부모보다 좁을 수 x
		System.out.println("자전거가 따르릉 거리며 달린다. (오버라이딩)");
	}
	
	void run(String sound) { // 오버로딩 --> 중복정의
		System.out.printf("자전거가 %s 거리며 달린다.\n", sound);
	}
	
	void stop() {
		System.out.println("자전거를 멈춘다.");
	}
}

public class VehicleEx {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		
		Vehicle v = new Bike(); // upcasting
		v.run(); // 부모의 run이 아닌 오버라이딩된 자식의 run 실행
//		v.stop(); // stop()은 자식 메소드로 오류 발생
	}

}
