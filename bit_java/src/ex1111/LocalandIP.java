package ex1111;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalandIP {

	public static void main(String[] args) {
		InetAddress inetaddr = null;
		try {
			inetaddr = InetAddress.getLocalHost(); // ���� ȣ��Ʈ�� �޾ƿ� (���α׷��� ����Ǵ� ��ǻ�͸� ����Ŵ)
		} catch (UnknownHostException e) {	
		}
		System.out.println(inetaddr.getHostName()); // �̸�
		System.out.println(inetaddr.getHostAddress()); // IP �ּ�
	}

}
