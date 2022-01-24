package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

class ServerThread extends Thread { // 다중 클라이언트 처리를 하기 위해
	private Socket socketOfServer;
	private static HashMap<String, PrintWriter> clients = new HashMap<String, PrintWriter>(); // 아이디와 메시지
	private InputStream in = null;
	private BufferedReader br = null;
	private OutputStream out = null;
	private PrintWriter pw = null;
	private String name;

	// 생성자
	public ServerThread(Socket socketOfServer) {
		this.socketOfServer = socketOfServer;
		try {
			// 입력과 관련
			in = this.socketOfServer.getInputStream(); // 소켓에 대한 입력 스트림 반환
			br = new BufferedReader(new InputStreamReader(in)); // 이름을 받아오기 위함

			// 출력과 관련
			out = this.socketOfServer.getOutputStream(); // 소켓에 대한 출력 스트림 반환
			pw = new PrintWriter(new OutputStreamWriter(out));

			name = br.readLine(); // 클라이언트에서 이름 받아옴
			addClient(name, pw); // 클라이언트 추가, 접속 아이디 출력

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			String msg = null;
			while ((msg = br.readLine()) != null) { // 한 줄씩 read
				if (msg.equalsIgnoreCase("/quit")) {
					removeClient(name); // quit했으니 사용자 삭제
					sendMsg(name + "님이 접속 종료하였습니다.");
					break;
				} else {
					sendMsg(msg); // 읽어온 메시지를 사용자들에게 출력
				}
			}
			pw.close();
			br.close();
			socketOfServer.close();
		} catch (IOException e) { // 쓰레드가 강제 종료되면 catch로 넘어감 --> 사용자가 quit했다는 뜻
			removeClient(name); // 사용자 삭제
		}
	}

	public void removeClient(String name) {
		System.out.println(name + "님이 접속 종료하였습니다.");
		clients.remove(name); // 사용자 삭제
	}

	// 서버 출력: 접속한 사용자 아이디 출력, Map에 사용자 추가
	public void addClient(String name, PrintWriter pw) {
		System.out.printf("접속한 사용자의 아이디는 %s 입니다.\n", name); // 서버에서 출력
		sendMsg(name + "님이 접속하였습니다.");
		clients.put(name, pw);
	}

	// 클라이언트 출력: 모든 사용자에게 메시지를 출력
	public void sendMsg(String msg) {
		Iterator<String> it = clients.keySet().iterator(); // clients의 키 값에 iterator를 줌 --> 아이디 모두 가져옴
		String key = "";

		if (msg.startsWith("/to")) {
			String[] part = msg.split(" ", 3); // 공백으로 귓속말 분리 (문자열을 3개로 파싱)
			while (it.hasNext()) {
				key = it.next();
				if (key.equals(part[1])) {
					clients.get(key).println(name + "님이 다음의 귓속말을 보내셨습니다. :" + part[2]);
					clients.get(key).flush();
					break;
				}
			}
		} else {
			while (it.hasNext()) { // 아이디가 있을 때만
				key = it.next(); // 키를 받아옴
				clients.get(key).println(msg); // 각 사용자에게 메시지를 출력
				clients.get(key).flush();
			}
		}
	}
}

public class ChatServer {
	public static void main(String[] args) {
		// 연결 받아서 쓰레드 돌려주기
		try {
			ServerSocket server = new ServerSocket(9999); // 포트번호 9999로 서버 소켓 생성
			System.out.println("접속을 기다립니다.");
			while (true) { // 다중 클라이언트를 받기 위해
				Socket socketOfServer = server.accept(); // 연결
				ServerThread serverThread = new ServerThread(socketOfServer); // 쓰레드 생성
				serverThread.start(); // 쓰레드 실행
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}