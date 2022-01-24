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
		BufferedReader in = null; // 소켓 입력
		BufferedReader stin = null; // 키보드 입력
		PrintWriter out = null; // 클라이언트에 출력
		ServerSocket server = null;
		Socket socketOfServer = null;
		try {
			server = new ServerSocket(9999); // 서버 소켓 생성
			socketOfServer = server.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결됨");
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
				out.println("서버>" + outputMessage);
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
