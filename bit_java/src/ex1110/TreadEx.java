package ex1110;

class TimerThread extends Thread {
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return;
			}	
		}
	}
}

public class TreadEx {

	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		
		try {
			Thread.sleep(10000); // 10�� ���� 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		th.interrupt(); // ������ ���� 10�� �Ŀ� ����
	}

}
