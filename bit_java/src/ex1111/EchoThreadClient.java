package ex1111;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThreadClient {

	public static void main(String[] args) {
		try {
			Socket socketOfClient = new Socket("127.0.0.1", 9999); // IP 주소와 포트번호로 클라이언트 소켓 생성
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
			OutputStream out = socketOfClient.getOutputStream(); // 소켓에 출력 스트림 연결
			InputStream in = socketOfClient.getInputStream(); // 소켓에 입력 스트림 연결
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while ((line = keyboard.readLine()) != null) { // 키보드 입력 한 줄씩 read
				if (line.equals("quit")) {
					break;
				}
				pw.println(line); // 서버에 연결된 소켓으로 출력
				pw.flush();
				String echo = br.readLine(); // 서버로부터 입력 받아옴 - echo msg
				System.out.println("서버로부터 전달받은 문자열 : " + echo);
			}
			pw.close();
			br.close();
			socketOfClient.close();
		} catch (Exception e) {}

	}
}
