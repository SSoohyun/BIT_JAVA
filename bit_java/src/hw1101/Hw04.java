package hw1101;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요.");
		while(true) {
			System.out.print("입력 >> ");
			int num = scan.nextInt();
			if(num>=10 && num <=99) {
				System.out.printf("입력받은 정수의 값은 %d임\n", num);
				break;
			}
		}
		
		scan.close();
	}

}
