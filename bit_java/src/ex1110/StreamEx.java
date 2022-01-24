package ex1110;

public class StreamEx {

	public static void main(String[] args) throws Exception {
		int b, len = 0;
		int bArray[] = new int[100];
		
		System.out.println("---입력 스트림---");
		while ((b = System.in.read()) != '\n') { // 한 바이트씩 읽어옴
			System.out.printf("%c(%d)", (char) b, b); // 형변환함
			bArray[len++] = b; // 버퍼에 하나씩 담음
		}

		System.out.println("\n\n---출력 스트림---");
		for (int i = 0; i < len; i++) {
			System.out.write(bArray[i]);
		}
		System.out.flush(); // 버퍼 비우기
	}

}
