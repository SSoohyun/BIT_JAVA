package ex1110;

public class StreamEx {

	public static void main(String[] args) throws Exception {
		int b, len = 0;
		int bArray[] = new int[100];
		
		System.out.println("---�Է� ��Ʈ��---");
		while ((b = System.in.read()) != '\n') { // �� ����Ʈ�� �о��
			System.out.printf("%c(%d)", (char) b, b); // ����ȯ��
			bArray[len++] = b; // ���ۿ� �ϳ��� ����
		}

		System.out.println("\n\n---��� ��Ʈ��---");
		for (int i = 0; i < len; i++) {
			System.out.write(bArray[i]);
		}
		System.out.flush(); // ���� ����
	}

}
