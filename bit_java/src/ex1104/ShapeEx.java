package ex1104;

abstract class Shape {	
	Shape() {}
	
	abstract public double calArea();
}


class Circle extends Shape {
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calArea() {
		return radius*radius*Math.PI;
	}
}

class Rectangle extends Shape {
	public double width;
	public double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calArea() {
		return width*height;
	}
}

public class ShapeEx {

	public static void main(String[] args) {
		
		Shape[] sArray = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		double sum = 0; // 면적의 합
		
		for(int i=0; i<sArray.length; i++) {
			sum += sArray[i].calArea();
		}
		
		System.out.printf("면적의 합: %f\n", sum);
		
	}

}
