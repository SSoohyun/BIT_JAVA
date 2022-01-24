package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		BufferedReader in = null; // ���� �Է�
		BufferedReader stin = null; // Ű���� �Է�
		PrintWriter out = null; // Ŭ���̾�Ʈ�� ���
		ServerSocket server = null;
		Socket socketOfServer = null;
		try {
			server = new ServerSocket(9999); // ���� ���� ����
			socketOfServer = server.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("�����");
			in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
			
			String inputMessage;
					
			while (true) {
				inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) {
					break;
				}
				System.out.println(inputMessage);
				String outputMessage = stin.readLine();
				out.println("����>" + outputMessage);
				out.flush();
			}
		} catch (IOException e) {
		} finally {
			try {
				socketOfServer.close();
				server.close();
			} catch (IOException e) {
				
			} catch (NullPointerException e) {}
		}

	}

}
