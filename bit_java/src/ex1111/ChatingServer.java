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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class ChatingThread extends Thread {
	private Socket socketOfServer; // 서버 소켓
	private HashMap<String, Object> hm;
	private BufferedReader br;
	private String id;
	private boolean initFlag = false;

	public ChatingThread(Socket socketOfServer, HashMap<String, Object> hm) {
		this.socketOfServer = socketOfServer;
		// 유저 정보 저장
		this.hm = hm;
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
			id = br.readLine();
			broadcast(id + "님이 접속하였습니다.");
			System.out.println("접속한 사용자의 아이디 : "+id);
			synchronized (hm) {
				hm.put(this.id, pw);
			}
			initFlag = true;
		} catch (Exception e) {}
	}
	
	@Override
	public void run() {
		try {
            String line = null;
            while((line = br.readLine()) != null) {
                if(line.equals("/quit")) {
                    break;
                }
                if(line.indexOf("/to") == 0) {
                    sendMsg(line);
                }else {
                    broadcast(id+" : "+line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            synchronized (hm) {
                hm.remove(id);
            }
            broadcast(id+"님이 접속을 종료했습니다.");
            try {
                if(socketOfServer != null) {
                    socketOfServer.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
	}
	
	public void sendMsg(String msg) {
		int start = msg.indexOf(" ") + 1;
		int end = msg.indexOf(" ", start);
		if (end != -1) {
			String to = msg.substring(start, end);
			String msg2 = msg.substring(end + 1);
			Object obj = hm.get(to);
			if (obj != null) {
				PrintWriter pw = (PrintWriter) obj;
				pw.println(id + "님이 다음의 귓속말을 보내셨습니다. : " + msg2);
				pw.flush();
			}
		}
	}
	
	// 모든 클라이언트에게 입장을 알림
	public void broadcast(String msg) {
		synchronized (hm) {
			Collection<Object> collection = hm.values();
			Iterator<?> iter = collection.iterator();
			while (iter.hasNext()) {
				PrintWriter pw = (PrintWriter) iter.next();
				pw.println(msg);
				pw.flush();
			}
		}
	}
}

public class ChatingServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			HashMap<String, Object> hm = new HashMap<String, Object>();
			while (true) {
				Socket socketOfServer = server.accept(); // 연결
				ChatingThread chatThread = new ChatingThread(socketOfServer, hm);
				chatThread.start();
			}
		} catch (IOException e) {}
	}
}
