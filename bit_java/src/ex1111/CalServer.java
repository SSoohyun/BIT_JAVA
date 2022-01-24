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
			ServerSocket server = new ServerSocket(9999); // ���� ���� ����
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); // Ŭ���̾�Ʈ�� ����
			InetAddress inetaddr = socketOfServer.getInetAddress(); 
			System.out.println(inetaddr.getHostAddress() + "�� ���� �����Ͽ����ϴ�."); // IP �ּ�
			OutputStream out = socketOfServer.getOutputStream(); // ���Ͽ� ��� ��Ʈ�� ����
			InputStream in = socketOfServer.getInputStream(); // ���Ͽ� �Է� ��Ʈ�� ����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : " + line);
				String n_line = calculate(line);
				pw.println(n_line); // ���۷� ��
				pw.flush(); // ���ۿ��� ������ �������� ���
			}
			pw.close();
			br.close();
			socketOfServer.close();	
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}
	
	public static String calculate(String line) {		
		String[] strArray = line.split(" "); // �������� ���ø�
		double result = 0; // �� ����� ���� ����
		String res = ""; // ������ ���� ����
		
		// �������� �Ǻ��� �ʿ䰡 ����
		double num1 = 0;
		double num2 = 0;
		
		try {
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[2]);
		} catch (NumberFormatException e){
			res = "������� �߸��ƽ��ϴ�.";
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
			res = "������� �߸��ƽ��ϴ�.";
			break;
		}
		
		return res;
	}

}
