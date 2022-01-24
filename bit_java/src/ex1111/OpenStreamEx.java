package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class OpenStreamEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org");
			// openStream으로 스트림 생성해서 InputStream으로 일반 스트림 입력을 수행
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) { // 한 줄씩 read
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) { 
			System.out.println("URL에서 데이터를 읽는 중");
		}
	}

}
