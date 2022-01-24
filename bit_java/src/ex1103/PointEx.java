package ex1103;

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ��ǥ ���
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	String color; // ��
	
	// �� ����
	void setColor(String color) {
		this.color = color;
	}
	
	// ���� ��ǥ ���
	void showColorPoint() {
//		System.out.println(color + "(" + x + "," + y + ")"); // x, y�� ���� getter/setter �ʿ�
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
