package ex1103;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // �޴� ��ȣ
		
		BREAK: // ���α׷� ���� �� ���ѷ����� Ż��
		while(true) {
			System.out.println("1.���� ���� �Է� | 2.���� ��� ���� | 3.�˻��ϱ�(����) | "
								+ "4.��������(�����۰�����/������������) | 5.���α׷� ����");
			menu = scan.nextInt();
			
			// �޴� ���ÿ� ����
			switch(menu) {
			case 1: // ���� ���� �Է�
				System.out.println("å ����, ����, �̸���, ����, ����, ���� ������ �Է��Ͻÿ� -->>");
				// �迭�� ����
				break;
			case 2: // ���� ��� ���� --> ����� ���� �ҷ��ͼ� ���
				break;
			case 3: // �˻��ϱ�
				System.out.print("������ �Է��ϼ��� -->>");
				// �迭���� å ����� ��ġ�ϴ� ��� ���� ���
				break;
			case 4: // ��������(�����۰�����/������������)
				break;
			case 5: // ���α׷� ����
				break BREAK; // ���� Ż��
			}
		}
		
	}

}
