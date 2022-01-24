package ex1105;

import java.util.Random;

public class SortEx {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] intArray = new int[5];
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = rand.nextInt(100)+1;
			System.out.printf("intArray[%d]=%d\n", i, intArray[i]);
		}
		
		// 역순으로 정렬
		for(int i=0; i<intArray.length/2; i++) {
			int tmp = intArray[i];
			intArray[i] = intArray[intArray.length-1-i];
			intArray[intArray.length-1-i] = tmp;
		}
		
		
		System.out.println("역순으로 정렬한 후");
		for(int i=0; i<intArray.length; i++) {
			System.out.printf("intArray[%d]=%d\n", i, intArray[i]);
		}
	}

}
