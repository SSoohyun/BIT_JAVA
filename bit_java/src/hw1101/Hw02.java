package hw1101;

import java.util.Scanner;

public class Hw02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
		
		scan.close();
	}
	
}
