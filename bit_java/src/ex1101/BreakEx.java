package ex1101;

public class BreakEx {

	public static void main(String[] args) {
		/*
		int i = 0;
		while(true) { // �ݺ��� ����
			if(i == 100) {
				break; // �ݺ��� Ż��
				// continue; // next turn����
			}
			System.out.println(i++);
		} // �ݺ��� ��
		*/
		
		
		Loops:
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5) {
						// break Loops; // ��ø �ݺ��� �� ���� Ż��
						// break; // ���� ����� �ݺ��� Ż��
						continue Loops; // ���� ����� �ݺ��� Ż��
						// continue; // ���� ������
					}
					System.out.println(i + "*" + j + "=" + i*j);
				}
		}
		
	}

}
