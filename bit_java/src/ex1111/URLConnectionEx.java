package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org"); // URL 객체 생성
			URLConnection uc = url.openConnection(); // URL 객체에서 URLConnection 객체 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // 입력 스트림 생성
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) { // 한 줄씩 read
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생");
		}

	}

}
