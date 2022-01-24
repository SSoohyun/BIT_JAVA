package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		BufferedReader in = null; // ���� �Է�
		BufferedReader stin = null; // Ű���� �Է�
		PrintWriter out = null; // ������ ���
		Socket socketOfClient = null;
		try {
			socketOfClient = new Socket("127.0.0.1", 9999); // IP �ּҿ� ��Ʈ��ȣ�� Ŭ���̾�Ʈ ���� ����
			in = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
			
			String outputMessage;
			while (true) { 
				outputMessage = stin.readLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.println(outputMessage);
					out.flush();
					break;
				}
				out.println("Ŭ���̾�Ʈ>" + outputMessage);
				out.flush();
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			
		} finally {
			try {
				socketOfClient.close();
			} catch (IOException e) {
				
			} catch (NullPointerException e) {
				
			}
		}

	}

}
