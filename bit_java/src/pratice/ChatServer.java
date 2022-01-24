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

class ServerThread extends Thread { // ���� Ŭ���̾�Ʈ ó���� �ϱ� ����
	private Socket socketOfServer;
	private static HashMap<String, PrintWriter> clients = new HashMap<String, PrintWriter>(); // ���̵�� �޽���
	private InputStream in = null;
	private BufferedReader br = null;
	private OutputStream out = null;
	private PrintWriter pw = null;
	private String name;

	// ������
	public ServerThread(Socket socketOfServer) {
		this.socketOfServer = socketOfServer;
		try {
			// �Է°� ����
			in = this.socketOfServer.getInputStream(); // ���Ͽ� ���� �Է� ��Ʈ�� ��ȯ
			br = new BufferedReader(new InputStreamReader(in)); // �̸��� �޾ƿ��� ����

			// ��°� ����
			out = this.socketOfServer.getOutputStream(); // ���Ͽ� ���� ��� ��Ʈ�� ��ȯ
			pw = new PrintWriter(new OutputStreamWriter(out));

			name = br.readLine(); // Ŭ���̾�Ʈ���� �̸� �޾ƿ�
			addClient(name, pw); // Ŭ���̾�Ʈ �߰�, ���� ���̵� ���

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			String msg = null;
			while ((msg = br.readLine()) != null) { // �� �پ� read
				if (msg.equalsIgnoreCase("/quit")) {
					removeClient(name); // quit������ ����� ����
					sendMsg(name + "���� ���� �����Ͽ����ϴ�.");
					break;
				} else {
					sendMsg(msg); // �о�� �޽����� ����ڵ鿡�� ���
				}
			}
			pw.close();
			br.close();
			socketOfServer.close();
		} catch (IOException e) { // �����尡 ���� ����Ǹ� catch�� �Ѿ --> ����ڰ� quit�ߴٴ� ��
			removeClient(name); // ����� ����
		}
	}

	public void removeClient(String name) {
		System.out.println(name + "���� ���� �����Ͽ����ϴ�.");
		clients.remove(name); // ����� ����
	}

	// ���� ���: ������ ����� ���̵� ���, Map�� ����� �߰�
	public void addClient(String name, PrintWriter pw) {
		System.out.printf("������ ������� ���̵�� %s �Դϴ�.\n", name); // �������� ���
		sendMsg(name + "���� �����Ͽ����ϴ�.");
		clients.put(name, pw);
	}

	// Ŭ���̾�Ʈ ���: ��� ����ڿ��� �޽����� ���
	public void sendMsg(String msg) {
		Iterator<String> it = clients.keySet().iterator(); // clients�� Ű ���� iterator�� �� --> ���̵� ��� ������
		String key = "";

		if (msg.startsWith("/to")) {
			String[] part = msg.split(" ", 3); // �������� �ӼӸ� �и� (���ڿ��� 3���� �Ľ�)
			while (it.hasNext()) {
				key = it.next();
				if (key.equals(part[1])) {
					clients.get(key).println(name + "���� ������ �ӼӸ��� �����̽��ϴ�. :" + part[2]);
					clients.get(key).flush();
					break;
				}
			}
		} else {
			while (it.hasNext()) { // ���̵� ���� ����
				key = it.next(); // Ű�� �޾ƿ�
				clients.get(key).println(msg); // �� ����ڿ��� �޽����� ���
				clients.get(key).flush();
			}
		}
	}
}

public class ChatServer {
	public static void main(String[] args) {
		// ���� �޾Ƽ� ������ �����ֱ�
		try {
			ServerSocket server = new ServerSocket(9999); // ��Ʈ��ȣ 9999�� ���� ���� ����
			System.out.println("������ ��ٸ��ϴ�.");
			while (true) { // ���� Ŭ���̾�Ʈ�� �ޱ� ����
				Socket socketOfServer = server.accept(); // ����
				ServerThread serverThread = new ServerThread(socketOfServer); // ������ ����
				serverThread.start(); // ������ ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}