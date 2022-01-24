package ex1104;

interface Movable {
	// abstract
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable {
	int x, y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y += ySpeed;
	}
	
	@Override
	public void moveDown() {
		y -= ySpeed;
	}
	
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	
	@Override
	public void moveRight() {
		x += xSpeed;
	}
	
	public String toString() {
		return String.format("MovablePoint[x=%d, y=%d, xSpeed=%d, ySpeed=%d]" 
							, x, y, xSpeed, ySpeed);
	}
	
}

class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center; // 객체 생성 필요!!, 참조 변수만 선언한 것
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed); // 객체 생성
		
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		center.moveUp();;
	}
	
	@Override
	public void moveDown() {
		center.moveDown();
	}
	
	@Override
	public void moveLeft() {
		center.moveLeft();;
	}
	
	@Override
	public void moveRight() {
		center.moveRight();
	}
	
	public String toString() {
		return String.format("MovableCircle[center=%s, radius=%d]" 
							 , center.toString(), radius);
	}
}

public class MovableEx {

	public static void main(String[] args) {
		// MovablePoint
		System.out.println("포인트 이동 전");
		MovablePoint mp = new MovablePoint(5, 6, 10, 15);
		System.out.println(mp.toString());
		
		System.out.println("포인트 이동 후");
		mp.moveLeft();
		System.out.println(mp.toString());
		
		System.out.println("포인트 아래로 이동");
		mp.moveDown();
		System.out.println(mp.toString());
		
		// MovableCircle
		System.out.println("원 이동 전");
		MovableCircle mc = new MovableCircle(1, 2, 3, 4, 20);
		System.out.println(mc.toString());
		
		System.out.println("원 오른쪽으로 이동");
		mc.moveRight();
		System.out.println(mc.toString());
		
		System.out.println("원 위로 이동");
		mc.moveUp();
		System.out.println(mc.toString());
	}

}
