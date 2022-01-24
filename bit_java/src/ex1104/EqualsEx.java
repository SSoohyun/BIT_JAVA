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
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 같음");
		} else {
			System.out.println("r1과 r2가 각각 참조하는 두 사각형의 면적이 다름");
		}
		
		if(r1.equals(r3)) {
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 같음");
		} else {
			System.out.println("r1과 r3가 각각 참조하는 두 사각형의 면적이 다름");
		}
		
	}

}
