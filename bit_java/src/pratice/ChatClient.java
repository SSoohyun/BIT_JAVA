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

// �Է°� ����� ���������� �ϱ� ���� �Է°� ��¿� ���� �����尡 �ʿ�
class InputThread extends Thread {
	Socket socketOfClient;
	InputStream in = null;
	BufferedReader br = null;

	public InputThread(Socket socketOfClient) {
		this.socketOfClient = socketOfClient;

		try {
			// �������� �޾ƿ��� ����
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
	BufferedReader stin = null; // Ű���� �Է¿�
	String name;

	public OutputThread(Socket socketOfClient, String name) {
		this.socketOfClient = socketOfClient;
		this.name = name; // ���̵�

		try {
			// ���� ����� ����
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
			// �޽����� �Է¹ޱ� ����
			InputStream in = socketOfClient.getInputStream();
			stin = new BufferedReader(new InputStreamReader(System.in));

			String outputMessage = null;
			while (true) {
				outputMessage = stin.readLine(); // �޽��� �� �� read
				if (outputMessage.equalsIgnoreCase("/quit")) { // ����
					System.out.println("Ŭ���̾�Ʈ�� ������ �����մϴ�.");
					pw.println(outputMessage);
					pw.flush();
					break; // �ݺ��� Ż��
				} else if (outputMessage.startsWith("/to")) { // �ӼӸ�
					pw.println(outputMessage);
					pw.flush();
				} else { // �Ϲ� ä��
					pw.println(name + " : " + outputMessage); // ä��
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
		// ���̵� IP�ּ� ������ args���� �Է¹޾ƿ�
		try {
			Socket socketOfClient = new Socket(args[1], 9999); // IP�ּҿ� ��Ʈ��ȣ�� Ŭ���̾�Ʈ ���� ����

			// ����� ������ ����
			InputThread inputThread = new InputThread(socketOfClient);
			OutputThread outputThread = new OutputThread(socketOfClient, args[0]);

			// ������ ����
			inputThread.start(); // �������� Ŭ���̾�Ʈ�� �޽����� ����
			outputThread.start(); // Ŭ���̾�Ʈ�� �Է��� ������ ����

		} catch (UnknownHostException e) { // �̻��� �ּ�

		} catch (IOException e) {
		}
	}
}