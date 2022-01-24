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
		
		System.out.print("2번 위치에 삽입하기 전 : ");
		System.out.println(al.get(2)); // java
		
		al.add(2, "stupid"); // insert
		System.out.print("2번 위치에 삽입한 다음 : ");
		System.out.println(al.get(2)); // stupid
		
//		al.add(5, "stupid"); // 건너뛰고 추가 불가능
		
		System.out.print("1번 위치 삭제하기 전 : ");
		System.out.println(al.get(1)); // Hi
		
		al.remove(1); // remove
		System.out.print("1번 위치 삭제한 다음 : ");
		System.out.println(al.get(1)); // stupid
		
//		al.remove(10); // IndexOufOfBoundsException
		*/
		
		
		// 예제
		ArrayList<String> al = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			al.add(scan.next()); // 이름 추가
		}
		
		int len = -1; // 이름 길이
		int max = -1; // 가장 긴 이름의 인덱스
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
		
		
		System.out.printf("가장 긴 이름은 : %s", al.get(max));
	}

}
