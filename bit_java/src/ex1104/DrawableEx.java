package ex1104;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

public class DrawableEx {

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();

	}

}
