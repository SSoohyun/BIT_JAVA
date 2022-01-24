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
		BufferedReader in = null; // 소켓 입력
		BufferedReader stin = null; // 키보드 입력
		PrintWriter out = null; // 서버에 출력
		Socket socketOfClient = null;
		try {
			socketOfClient = new Socket("127.0.0.1", 9999); // IP 주소와 포트번호로 클라이언트 소켓 생성
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
				out.println("클라이언트>" + outputMessage);
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
