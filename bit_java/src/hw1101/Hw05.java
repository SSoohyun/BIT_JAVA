package hw1101;

public class Hw05 {

	public static void main(String[] args) {
		int i = 1;
		while(true) {
			int width = 1;
			int height = 1;
			
			width = 2*i;
			height = 3*i;
			
			double tri = 0.5*width*height;
			if(tri > 150) {
				break;
			}
			System.out.printf("»ï°¢ÇüÀÇ ³ĞÀÌ: %.1f\n", tri);
			i++;
		}

	}

}
