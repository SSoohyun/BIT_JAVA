package ex1111;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("도메인 주소를 인자로 지정하세요.");
			System.exit(1);
		}
		
		URL url = null;
		try {
			url = new URL(args[0]);
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL 형식입니다.");
			System.out.println(e);
			System.exit(1);
		}
		
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트 이름: " + url.getHost());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("파일이름 : " + url.getPath());
		System.out.println("사용자 쿼리 : " + url.getQuery());
	}

}
