package ex1105;

import java.util.Scanner;

public class MidEx {

	public static void main(String[] args) {
		// 예제
		// 세 수의 중앙값 구하기
		Scanner scan = new Scanner(System.in);
		int[] n = new int[3];
		
		System.out.print("a : ");
		n[0] = scan.nextInt();
		System.out.print("b : ");
		n[1] = scan.nextInt();
		System.out.print("c : ");
		n[2] = scan.nextInt();
		
		// 3 4 1
		// 4 3 1
		
		// 3 4 10
		// 4 3 10
		
		// 4 3 2
		// 3 4 2
		
		// 정렬
		int i, j;
		for(i=1; i<n.length; i++) {
			int tmp = n[i];
			for(j=i-1; j>=0 && tmp < n[j]; j--) {
					n[j+1] = n[j];
			}
			n[j+1] = tmp;
		}
		System.out.println(n[1]);
		
		int max = n[0];
		int min = n[0];
		if(n[1]>max) {
			max = n[1];
		}
		if(n[2]>max) {
			max = n[2];
		}
		if(n[1]<min) {
			min = n[1];
		}
		if(n[2]<min) {
			min = n[2];
		}
		
		for(int k=0; k<n.length; k++) {
			if(n[k] != min && n[k] != max) {
				System.out.printf("중앙값은 : %d임\n", n[k]);
				break;
			}
		}
		
	}

}
