package hw1101;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		while(true) {
			System.out.print("�Է� >> ");
			int num = scan.nextInt();
			if(num>=10 && num <=99) {
				System.out.printf("�Է¹��� ������ ���� %d��\n", num);
				break;
			}
		}
		
		scan.close();
	}

}
