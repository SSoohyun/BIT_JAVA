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
			ServerSocket server = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept(); // 클라이언트와 연결
			InetAddress inetaddr = socketOfServer.getInetAddress(); 
			System.out.println(inetaddr.getHostAddress() + "로 부터 접속하였습니다."); // IP 주소
			OutputStream out = socketOfServer.getOutputStream(); // 소켓에 출력 스트림 연결
			InputStream in = socketOfServer.getInputStream(); // 소켓에 입력 스트림 연결
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("클라이언트로부터 전송받은 문자열 : " + line);
				Date now = new Date(); // 현재 시간
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); // 포맷 지정
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
