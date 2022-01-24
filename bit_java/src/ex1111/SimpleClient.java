package ex1111;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket socketOfClient = new Socket("127.0.0.1", 9999); // IP 주소와 포트번호로 클라이언트 소켓 생성
			OutputStream out = socketOfClient.getOutputStream(); // 소켓에 출력 스트림 연결
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); 
			pw.println("Hi, Server"); // 서버에 연결된 소켓으로 출력
			pw.flush();
		} catch (Exception e) {}
	}

}
