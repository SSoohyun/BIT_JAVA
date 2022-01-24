package hw1102;

class Circle {
	public double radius = 1.0; // ������
	
	// ������
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// ����
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// �ѷ�
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + getRadius() + "]";
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// ��ü ����
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		
		System.out.printf("%s�� �ѷ��� %.2f, ������ %.2f\n", c1.toString(), c1.getCircumference(), c1.getArea());
		System.out.printf("%s�� �ѷ��� %.2f, ������ %.2f\n", c2.toString(), c2.getCircumference(), c2.getArea());
	}

}
