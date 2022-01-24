package ex1104;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그리다.");
	}
}

public class DrawableEx {

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();

	}

}
