package ex1103;

class Circle {
	// 객체 생성되면 heap 공간에 생성
	// 인스턴스 멤버
	int radius;
	String color;
	
	// 메소드, stack, heap 중 메소드 공간에 가장 먼저 생성
	// static 키워드가 없으면 radius, color와 같은 iv
	// 클래스 멤버, 정적 멤버 <--> 인스턴스 멤버
	// 참조 변수가 아닌 클래스 이름으로 접근
	static int numberOfCircles; // 0
	
	// alt + shift + s + o (생성자 단축키)
	Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
}
	
public class CircleEx {
	
	public static void main(String[] args) {
		Circle c1 = new Circle(100, "red");
		Circle c2 = new Circle(50, "red");
		
		Circle.numberOfCircles++; // 1
		System.out.println(c1.numberOfCircles); // 1
		
		Circle.numberOfCircles++; // 2
		Circle.numberOfCircles++; // 3
		System.out.println(c2.numberOfCircles); // 3
	}	

}
