package ex1110;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "��: �۾� ������");
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class MyThreadEx {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
//		thread.start(); // ������ ������ �ٽ� ��ŸƮ �Ұ���
		
//		thread.run(); // ���� ����x, �۾� ������ �� ������ �� ������ ������
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "��: main ������");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
