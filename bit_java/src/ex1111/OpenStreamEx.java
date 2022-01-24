package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class OpenStreamEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org");
			// openStream���� ��Ʈ�� �����ؼ� InputStream���� �Ϲ� ��Ʈ�� �Է��� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) { // �� �پ� read
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) { 
			System.out.println("URL���� �����͸� �д� ��");
		}
	}

}
