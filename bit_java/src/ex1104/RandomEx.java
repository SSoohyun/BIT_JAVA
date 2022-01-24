package ex1104;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] iArray = new int[10]; // 배열 생성
		for(int i=0; i<iArray.length; i++) {
			iArray[i] = rand.nextInt(100) + 1; // 1-100사이 난수 생성하여 저장
			System.out.printf("%d ", iArray[i]);
		}
		
		int i, j;
		for(i=1; i<iArray.length; i++) {
			int tmp = iArray[i];
			for(j=i-1; j>=0 && iArray[j]>tmp; j--) {
				iArray[j+1] = iArray[j];
				
			}
			iArray[j+1] = tmp;	
		}
		
		System.out.println();
		System.out.println();
		for(int k : iArray) {
			System.out.println(k);
		}
	}

}
