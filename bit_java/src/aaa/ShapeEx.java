package aaa;

abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract public double getArea();
	abstract public double getPerimeter();
	
	public String toString() {	
		return String.format("Shape[color=%s, filled=%s]", color, filled);
	}
}

class Circle extends Shape {
	protected double radius = 1.0;
	
	public Circle() {}
		
	public Circle(String color, boolean filled) {
		super(color, filled);
	}
	
	public Circle(double radius, String color, boolean filled) {
		this(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {	
		return String.format("Circle[%s, radius=%.1f]", super.toString(), radius);
	}
}

class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {}
	
	public Rectangle(String color, boolean filled) {
		super(color, filled);
	}
	
	public Rectangle(String color, boolean filled, double width, double length) {
		this(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return width*length;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {	
		return String.format("Rectangle[%s, width=%.1f, length=%.1f]", super.toString(), width, length);
	}
	
}

class Square extends Rectangle {
	public Square() {}
	
	public Square(double side) {
		width = side;
		length = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled, side, side);
	}
	
	public double getSide() {
		return length;
	}
	
	public void setSide(double side) {
		length = side;
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public String toString() {	
		return String.format("Square[%s]", super.toString());
	}
	
}

public class ShapeEx {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,s1,s1.getArea(), s1.getPerimeter());                    
		//System.out.printf("%s의 반지름은 %.2f", s1, s1.getRadius());//?
		   
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,c1,c1.getArea(), c1.getPerimeter()); 
		System.out.printf("%s의 반지름은 %.2f\n", c1, c1.getRadius());

		//Shape s2 = new Shape();
		   
		Shape s3 = new Rectangle("red", false, 1.0, 2.0);   // Upcast
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,s3,s3.getArea(), s3.getPerimeter()); 
		//System.out.printf("%s의 밑변은 %.2f\n", s3, s3.getLength());
		   
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,r1,r1.getArea(), r1.getPerimeter()); 
		System.out.printf("%s의 밑변은 %.2f\n", r1, r1.getLength());
		
		Shape s4 = new Square(6.6);     // Upcast
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,s4,s4.getArea(), s4.getPerimeter()); 
		//System.out.println(s4.getSide());
		  

		Rectangle r2 = (Rectangle)s4;
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,r2 ,r2 .getArea(), r2.getPerimeter()); 
		//System.out.printf("%s의 높이는 %.2f\n", r2, r2.getSide());
		System.out.printf("%s의 밑변은 %.2f\n", r2, r2.getLength());
		   
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.printf("%s의 면적은, %.2f, 둘레는 %.2f\n"
				,sq1 ,sq1.getArea(),sq1.getPerimeter()); 
		System.out.printf("%s의 높이는 %.2f\n", sq1, sq1.getSide());
		System.out.printf("%s의 밑변은 %.2f\n", sq1, sq1.getLength());
	}
}


