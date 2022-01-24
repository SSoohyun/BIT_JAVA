package ex1104;

class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Rect r) {
		if(width*height == r.width*r.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Rect r1 = new Rect(2, 6);
		Rect r2 = new Rect(3, 4);
		Rect r3 = new Rect(2, 4);
		
		
		if(r1.equals(r2)) {
			System.out.println("r1�� r2�� ���� �����ϴ� �� �簢���� ������ ����");
		} else {
			System.out.println("r1�� r2�� ���� �����ϴ� �� �簢���� ������ �ٸ�");
		}
		
		if(r1.equals(r3)) {
			System.out.println("r1�� r3�� ���� �����ϴ� �� �簢���� ������ ����");
		} else {
			System.out.println("r1�� r3�� ���� �����ϴ� �� �簢���� ������ �ٸ�");
		}
		
	}

}
