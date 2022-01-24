package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EchoServer { 

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999); // ���� ���� ����
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); // Ŭ���̾�Ʈ�� ����
			InetAddress inetaddr = socketOfServer.getInetAddress(); 
			System.out.println(inetaddr.getHostAddress() + "�� ���� �����Ͽ����ϴ�."); // IP �ּ�
			OutputStream out = socketOfServer.getOutputStream(); // ���Ͽ� ��� ��Ʈ�� ����
			InputStream in = socketOfServer.getInputStream(); // ���Ͽ� �Է� ��Ʈ�� ����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : " + line);
				Date now = new Date(); // ���� �ð�
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); // ���� ����
				pw.println(sdf.format(now));
				pw.println(line);
				pw.flush();
			}
			pw.close();
			br.close();
			socketOfServer.close();	
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}
