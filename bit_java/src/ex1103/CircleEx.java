package ex1103;

class Circle {
	// ��ü �����Ǹ� heap ������ ����
	// �ν��Ͻ� ���
	int radius;
	String color;
	
	// �޼ҵ�, stack, heap �� �޼ҵ� ������ ���� ���� ����
	// static Ű���尡 ������ radius, color�� ���� iv
	// Ŭ���� ���, ���� ��� <--> �ν��Ͻ� ���
	// ���� ������ �ƴ� Ŭ���� �̸����� ����
	static int numberOfCircles; // 0
	
	// alt + shift + s + o (������ ����Ű)
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
