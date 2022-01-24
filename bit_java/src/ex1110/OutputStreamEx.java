package ex1110;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("C:/temp/test1.txt"); // 폴더가 있어야 파일이 생성됨
		os.write((byte) 10);
		os.write((byte) 20);
		os.write((byte) 30);
		os.flush();
		os.close();
		
		os = new FileOutputStream("C:/temp/test2.txt"); // 폴더가 있어야 파일이 생성됨
		byte[] bArray1 = {10, 20, 30};
		os.write(bArray1);
		os.flush();
		os.close();
		
		os = new FileOutputStream("C:/temp/test3.txt"); // 폴더가 있어야 파일이 생성됨
		byte[] bArray2 = {10, 20, 30, 40, 50};
		os.write(bArray2, 1, 3); // index 1번부터 3개
		os.flush();
		os.close();
	}

}
