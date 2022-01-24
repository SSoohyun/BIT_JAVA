package ex1103;

class MyCircle {
	private double radius = 1.0;
	private String color = "red";
	
	public MyCircle() {}
	public MyCircle(double radius) {
		this.radius = radius;
	}
	public double getRadius() { // getter
		return radius;
	}
	public void setRadius(double radius) { // setter
		this.radius = radius;
	}
	
}


public class MyCircleEx {

	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		c.getRadius();
	

	}

}
