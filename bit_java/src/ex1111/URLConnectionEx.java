package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org"); // URL ��ü ����
			URLConnection uc = url.openConnection(); // URL ��ü���� URLConnection ��ü ����
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // �Է� ��Ʈ�� ����
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) { // �� �پ� read
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("URL���� �����͸� �д� �� ������ �߻�");
		}

	}

}
