package ex1104;

interface GeometricObject {
	double getPerimeter();
	double getArea();
}

interface Resizable {
	void resize(int percent);
}

class Circle implements GeometricObject {
	protected double radius = 1.0;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}

class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public void resize(int percent) {
		radius += radius * percent/100;
	}
	
	@Override
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
	
}

public class CircleEx {

	public static void main(String[] args) {
		Circle c = new Circle(1.0);
		System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", c.toString(), c.getPerimeter(), c.getArea());
		System.out.println("-----------------------------------------------------------");
		
		ResizableCircle rc = new ResizableCircle(2.0);
		System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", rc.toString(), rc.getPerimeter(), rc.getArea());
		
		rc.resize(10);
		System.out.println("크기를 10퍼센트 크게 변경 후");
		System.out.printf("%s의 둘레는 %.1f, 면적은 %.1f\n", rc.toString(), rc.getPerimeter(), rc.getArea());
	}

}
