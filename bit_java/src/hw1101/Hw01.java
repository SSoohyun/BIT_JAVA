package hw1101;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ���۴� �Է� --> ");
		int start = scan.nextInt(); 
		System.out.print("�������� ���� �Է� --> ");
		int end = scan.nextInt(); 
		
		if(start <= end) {
			for(int i=1; i<10; i++, System.out.println()) {
				for (int dan=start; dan<=end; dan++) {
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
				}
			}
		} else {
			for(int i=1; i<10; i++, System.out.println()) {
				for (int dan=start; dan>=end; dan--) {
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
				}
			}
		}
		
		scan.close();
	}

}
