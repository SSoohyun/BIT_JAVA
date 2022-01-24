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
			ServerSocket server = new ServerSocket(9999); // 포트번호로 서버 소켓 생성
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept(); // 연결 요청 수락 후 새 소켓 객체 받아옴
			InputStream in = socketOfServer.getInputStream(); // 새 소켓에서 입력을 받아옴
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = br.readLine();
			System.out.println("받은 문자열 = " + line);
		} catch (IOException e){}
	}

}
