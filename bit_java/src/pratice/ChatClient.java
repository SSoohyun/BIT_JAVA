package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 입력과 출력을 개별적으로 하기 위해 입력과 출력에 대한 쓰레드가 필요
class InputThread extends Thread {
	Socket socketOfClient;
	InputStream in = null;
	BufferedReader br = null;

	public InputThread(Socket socketOfClient) {
		this.socketOfClient = socketOfClient;

		try {
			// 서버에서 받아오기 위해
			in = socketOfClient.getInputStream();
			br = new BufferedReader(new InputStreamReader(in));
		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		try {
			String inputMessage = null;
			while (true) {
				inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch (IOException e) {
		}
	}
}

class OutputThread extends Thread {
	Socket socketOfClient;
	OutputStream out = null;
	PrintWriter pw = null;
	BufferedReader stin = null; // 키보드 입력용
	String name;

	public OutputThread(Socket socketOfClient, String name) {
		this.socketOfClient = socketOfClient;
		this.name = name; // 아이디

		try {
			// 서버 출력을 위해
			out = socketOfClient.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(name);
			pw.flush();
		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		try {
			// 메시지를 입력받기 위해
			InputStream in = socketOfClient.getInputStream();
			stin = new BufferedReader(new InputStreamReader(System.in));

			String outputMessage = null;
			while (true) {
				outputMessage = stin.readLine(); // 메시지 한 줄 read
				if (outputMessage.equalsIgnoreCase("/quit")) { // 종료
					System.out.println("클라이언트의 접속을 종료합니다.");
					pw.println(outputMessage);
					pw.flush();
					break; // 반복문 탈출
				} else if (outputMessage.startsWith("/to")) { // 귓속말
					pw.println(outputMessage);
					pw.flush();
				} else { // 일반 채팅
					pw.println(name + " : " + outputMessage); // 채팅
					pw.flush();
				}
			}
			pw.close();
			stin.close();
		} catch (IOException e) {
		}
	}
}

public class ChatClient {

	public static void main(String[] args) {
		// 아이디 IP주소 순으로 args에서 입력받아옴
		try {
			Socket socketOfClient = new Socket(args[1], 9999); // IP주소와 포트번호로 클라이언트 소켓 생성

			// 입출력 쓰레드 생성
			InputThread inputThread = new InputThread(socketOfClient);
			OutputThread outputThread = new OutputThread(socketOfClient, args[0]);

			// 쓰레드 실행
			inputThread.start(); // 서버에서 클라이언트로 메시지가 들어옴
			outputThread.start(); // 클라이언트의 입력이 서버로 나감

		} catch (UnknownHostException e) { // 이상한 주소

		} catch (IOException e) {
		}
	}
}