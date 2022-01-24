package ex1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileEx {

	public static void main(String[] args) {
		/*
		File file = new File("c:/windows/system.ini"); // 파일 객체 생성
		String res;
		if (file.isFile()) {
			res = "파일";
		} else {
			res = "디렉터리";
		}
		System.out.println(file.getPath() + "은 " + res + "입니다.");
		
		file = new File("c:/windows");
		File[] fs = file.listFiles(); // 파일 리스트를 모두 반환
		for (File f : fs) {
			if (f.isDirectory()) {
				System.out.printf("dir: %s\n", f);
			} else {
				System.out.printf("file: %s(%d bytes)\n", f, f.length());
			}
		}
		
		
		// 문자 스트림을 이용한 파일 복사
		File src = new File("c:/windows/system.ini");
		File dst = new File("c:/temp/system.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while ((c = in.read()) != -1) {
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		} catch (IOException e){
			System.out.println("파일 복사 오류");
		}
		*/
		// 라인으로 읽고 라인으로 출력
		BufferedReader br = null;
		PrintWriter pw = null;
		String line = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔 입력
//			br = new BufferedReader(new FileReader("c:/temp/han.txt")); // 파일 입력
			pw = new PrintWriter(new FileWriter("c:/temp/test5.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				pw.println(line);
			}
			pw.close();
		} catch (IOException e){
			
		}
	}

}
