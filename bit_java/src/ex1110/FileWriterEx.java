package ex1110;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in); // 키보드 입력을 위한 장치 준비
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:/temp/test4.txt"); // 파일에 저장하기 위한 준비
			while ((c = in.read()) != -1) {
				fout.write(c); // 파일에 쓰기 -> 파일에 저장
			}
			in.close();
			fout.close();
		} catch (IOException e){
			System.out.println("입출력 오류");
		}

	}

}
