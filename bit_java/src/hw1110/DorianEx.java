package hw1110;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DorianEx {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileInputStream fis = null;
		ArrayList<String> al = new ArrayList<String>();
		
		String line = null;
		try {
			fis = new FileInputStream("c:/temp/dorian.txt");
			br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
			while ((line = br.readLine()) != null) {
				String[] strArray = line.split(" |\\.|,|\'|\"");
				for (String str : strArray) {
					al.add(str);
				}
			}
			
			fis.close();
			br.close();
			Scanner scan = new Scanner(System.in);
			BREAK:
			while (true) {
				System.out.print("찾고 싶은 단어는 무엇입니까? ");
				int cnt = 0;
				String input = scan.next();
				if (input != null) {
					for (String s : al) {
						if (s.toLowerCase().equals(input.toLowerCase())) {
							cnt++;
						}
					}
				}
				
				if(cnt != 0) {
					System.out.printf("%d번 사용됨\n", cnt);
				} else {
					System.out.println("한 번도 사용한 적 없음");
				}
			}
		} catch (IOException e) {
			
		}
	}

}
