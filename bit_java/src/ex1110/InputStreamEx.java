package ex1110;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test1.txt");
//		int data;
//		while ((data = is.read()) != -1) {
//			System.out.println(data);
//		}
//		is.close();
		
//		is = new FileInputStream("c:/temp/test2.txt");
//		byte[] buffer = new byte[100];
//		int count; // 읽어온 바이트 수
//		 
//		while ((count = is.read(buffer)) != -1) {
//			for (int i = 0; i < count; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
		
		is = new FileInputStream("c:/temp/test2.txt");
		byte[] buffer = new byte[100];
		int count; // 읽어온 바이트 수
		 
		while ((count = is.read(buffer, 2, 3)) != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
