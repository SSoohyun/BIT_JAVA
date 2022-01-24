package hw1102;

class Rectangle {
	public double length = 1.0; // 세로
	public double width = 1.0; // 가로
	
	// 생성자
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	// 넓이
	public double getArea() {
		return length*width;
	}
	
	// 둘레
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public String toString() {
		return "Rectangle[length=" + getLength() + ", width=" + getWidth() + "]";
	}
}

public class RectangleEx {

	public static void main(String[] args) {
		// 객체 생성
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.0, 4.0);
		
		System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", r1.toString(), r1.getPerimeter(), r1.getArea());
		System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", r2.toString(), r2.getPerimeter(), r2.getArea());
	}

}
