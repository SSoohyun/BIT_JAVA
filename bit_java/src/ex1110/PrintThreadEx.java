package ex1110;
class PrinTable {
	/* synchronized */ public void prinTable(int n) { // ����ȭ
		System.out.println(n + "�� ���");
		for (int i = 0; i < 10; i++) {
			System.out.println(n + "*" + i + " = " + n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PrintThread extends Thread {
	PrinTable pt;
	int n;
	
	PrintThread(PrinTable pt, int n) {
		this.pt = pt;
		this.n = n;
	}
	
	public void run() {
		synchronized (pt) { // �Ϻ� ����ȭ
			pt.prinTable(n); // �����忡�� �۾��ϴ� ��
		}
//		pt.prinTable(n); // �����忡�� �۾��ϴ� ��
	}
}

public class PrintThreadEx {

	public static void main(String[] args) {
		PrinTable pt = new PrinTable();
		PrintThread th1 = new PrintThread(pt, 2);
		PrintThread th2 = new PrintThread(pt, 5);
		th1.start();
		th2.start();
	}

}
