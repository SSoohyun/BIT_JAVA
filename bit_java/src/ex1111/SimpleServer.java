package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999); // ��Ʈ��ȣ�� ���� ���� ����
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); // ���� ��û ���� �� �� ���� ��ü �޾ƿ�
			InputStream in = socketOfServer.getInputStream(); // �� ���Ͽ��� �Է��� �޾ƿ�
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = br.readLine();
			System.out.println("���� ���ڿ� = " + line);
		} catch (IOException e){}
	}

}
