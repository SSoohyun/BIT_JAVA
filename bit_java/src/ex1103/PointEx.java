package ex1103;

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 좌표 출력
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	String color; // 색
	
	// 색 설정
	void setColor(String color) {
		this.color = color;
	}
	
	// 색과 좌표 출력
	void showColorPoint() {
//		System.out.println(color + "(" + x + "," + y + ")"); // x, y에 대한 getter/setter 필요
		System.out.print(color);
		showPoint();
	}
}

public class PointEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(); // null(0,0)
		
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		
	}

}
