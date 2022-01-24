package ex1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatingClient {

	public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("사용법 : java ChatClient id 접속할 서버 ip");
            System.exit(1);
        }
        Socket socketOfClient = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        boolean endflag = false;
        try {
            socketOfClient = new Socket(args[1], 9999);//아아디,포트
            pw = new PrintWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            
            pw.println(args[0]);
            pw.flush();
            InputThread it = new InputThread(socketOfClient,br);
            it.start();
            String line = null;
            while((line = keyboard.readLine()) != null) {
                pw.println(line);
                pw.flush();
                if(line.equals("/quit")) {
                    endflag = true;
                    break;
                }
            }
            System.out.println("클라이언트 접속 종료");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pw != null) {
                    pw.close();
                }
                if(br != null) {
                    br.close();
                }
                if(socketOfClient != null) {
                    socketOfClient.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
 
class InputThread extends Thread{
    private Socket sock = null;
    private BufferedReader br = null;
    public InputThread(Socket sock,BufferedReader br) {
        this.sock = sock;
        this.br = br;
    }
    public void run() {
        try {
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(sock != null) {
                    sock.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}