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

public class CalServer {

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
				String n_line = calculate(line);
				pw.println(n_line); // 버퍼로 들어감
				pw.flush(); // 버퍼에서 강제로 내보내서 출력
			}
			pw.close();
			br.close();
			socketOfServer.close();	
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}
	
	public static String calculate(String line) {		
		String[] strArray = line.split(" "); // 공백으로 스플릿
		double result = 0; // 값 계산을 위한 변수
		String res = ""; // 리턴할 문자 변수
		
		// 숫자인지 판별할 필요가 있음
		double num1 = 0;
		double num2 = 0;
		
		try {
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[2]);
		} catch (NumberFormatException e){
			res = "연산식이 잘못됐습니다.";
		}
		
		switch (strArray[1]) {
		case "+":
			result = num1 + num2;
			res = line + " = " + result;
			break;
		case "-":
			result = num1 - num2;
			res = line + " = " + result;
			break;
		case "*":
			result = num1 * num2;
			res = line + " = " + result;
			break;
		case "/":
			result = num1 / num2;
			res = line + " = " + result;
			break;
		default:
			res = "연산식이 잘못됐습니다.";
			break;
		}
		
		return res;
	}

}
