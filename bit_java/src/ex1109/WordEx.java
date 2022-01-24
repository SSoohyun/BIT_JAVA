package ex1109;

import java.util.HashMap;
import java.util.Scanner;

public class WordEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("love", "사랑");
		map.put("apple", "사과");
		map.put("baby", "아기");
		
		Scanner scan = new Scanner(System.in);
		
		BREAK:
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String word = scan.next();
			
			if(word.equals("END")) {
				break BREAK;
			}
			
			if (map.get(word) != null) {
				System.out.println(map.get(word));
			} else {
				System.out.println("니가 찾는 단어는 없음");
			}
		}
	}

}
