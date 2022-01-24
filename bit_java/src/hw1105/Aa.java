package hw1105;

import java.util.Scanner;

public class Aa {

	public static void main(String[] args) {
//		String[] s = {"Aa", "Bb"};
//		String st = "";
//		
//		for(String ss : s) {
//			st += ss;
//		}
//		
//		System.out.println(st);
//		System.out.println(st.length());
		
		String[] s = {"Bcsdf", "Ba", "Aasdf"};

//		System.out.println(s.length);
		
		
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		String[] str = s;
		s = new String[s.length+1];
		
		
		// 원래 배열로 값 복사
		for (int i = 0; i < str.length; i++) {
			s[i] = str[i];
		}

		// 입력받은 값 추가
		s[s.length - 1] = name;
		
		// 이름 기준으로 오름차순 정렬
		int i, j;
		for (i = 1; i < s.length; i++) {
			String tmp = s[i];
			for (j = i - 1; j >= 0 && tmp.compareTo(s[j]) < 0; j--) {
				s[j+1] = s[j];
			}
			s[j+1] = tmp;
		}
		
		
		
//		for(int i=0; i<str.length; i++) {
//			if(str[i].equals(name)) {
//				// 이름이 존재하면 삭제
//				for(int j=i+1; j<str.length; j++) {
//					str[j-1] = str[j];
//				}
//				break;
//			}
//		}
//		
//		
//		for(String stt : str) {
//			System.out.println(stt);
//		}
//		
//		System.out.println();
//		
//		s = new String[s.length-1];
//		for(int i=0; i<s.length; i++) {
//			s[i] = str[i];
//		}
//		
//		System.out.println(s.length);
		for(String ss : s) {
			System.out.println(ss);
		}
	}

}
