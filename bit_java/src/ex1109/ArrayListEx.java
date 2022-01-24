package ex1109;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		/*
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("Java"); // append
		System.out.println(al.size());
//		System.out.println(al.get(0));
		
		System.out.print("2�� ��ġ�� �����ϱ� �� : ");
		System.out.println(al.get(2)); // java
		
		al.add(2, "stupid"); // insert
		System.out.print("2�� ��ġ�� ������ ���� : ");
		System.out.println(al.get(2)); // stupid
		
//		al.add(5, "stupid"); // �ǳʶٰ� �߰� �Ұ���
		
		System.out.print("1�� ��ġ �����ϱ� �� : ");
		System.out.println(al.get(1)); // Hi
		
		al.remove(1); // remove
		System.out.print("1�� ��ġ ������ ���� : ");
		System.out.println(al.get(1)); // stupid
		
//		al.remove(10); // IndexOufOfBoundsException
		*/
		
		
		// ����
		ArrayList<String> al = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			al.add(scan.next()); // �̸� �߰�
		}
		
		int len = -1; // �̸� ����
		int max = -1; // ���� �� �̸��� �ε���
		for(int i = 0; i < al.size(); i++) {
			System.out.printf("%s ", al.get(i));
			if(len < al.get(i).length()) {
				len = al.get(i).length();
				max = i;
			}
		}
		System.out.println();
		
		System.out.println("enhanced for ==========================");
		for(String str : al) {
			System.out.println(str);
		}
		
		
		System.out.printf("���� �� �̸��� : %s", al.get(max));
	}

}
