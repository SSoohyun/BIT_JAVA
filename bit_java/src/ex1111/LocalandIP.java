package ex1111;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalandIP {

	public static void main(String[] args) {
		InetAddress inetaddr = null;
		try {
			inetaddr = InetAddress.getLocalHost(); // 로컬 호스트를 받아옴 (프로그램이 실행되는 컴퓨터를 가리킴)
		} catch (UnknownHostException e) {	
		}
		System.out.println(inetaddr.getHostName()); // 이름
		System.out.println(inetaddr.getHostAddress()); // IP 주소
	}

}
