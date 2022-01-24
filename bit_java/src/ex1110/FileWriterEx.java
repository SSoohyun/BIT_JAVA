package ex1110;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in); // Ű���� �Է��� ���� ��ġ �غ�
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:/temp/test4.txt"); // ���Ͽ� �����ϱ� ���� �غ�
			while ((c = in.read()) != -1) {
				fout.write(c); // ���Ͽ� ���� -> ���Ͽ� ����
			}
			in.close();
			fout.close();
		} catch (IOException e){
			System.out.println("����� ����");
		}

	}

}
