package ex1109;

import java.util.HashMap;
import java.util.Scanner;

public class WordEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("love", "���");
		map.put("apple", "���");
		map.put("baby", "�Ʊ�");
		
		Scanner scan = new Scanner(System.in);
		
		BREAK:
		while(true) {
			System.out.print("ã�� ���� �ܾ��? ");
			String word = scan.next();
			
			if(word.equals("END")) {
				break BREAK;
			}
			
			if (map.get(word) != null) {
				System.out.println(map.get(word));
			} else {
				System.out.println("�ϰ� ã�� �ܾ�� ����");
			}
		}
	}

}
