package ex1111;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket socketOfClient = new Socket("127.0.0.1", 9999); // IP �ּҿ� ��Ʈ��ȣ�� Ŭ���̾�Ʈ ���� ����
			OutputStream out = socketOfClient.getOutputStream(); // ���Ͽ� ��� ��Ʈ�� ����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); 
			pw.println("Hi, Server"); // ������ ����� �������� ���
			pw.flush();
		} catch (Exception e) {}
	}

}
