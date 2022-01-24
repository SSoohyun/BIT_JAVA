package ex1110;
class PrinTable {
	/* synchronized */ public void prinTable(int n) { // 동기화
		System.out.println(n + "단 출력");
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
		synchronized (pt) { // 일부 동기화
			pt.prinTable(n); // 쓰레드에서 작업하는 것
		}
//		pt.prinTable(n); // 쓰레드에서 작업하는 것
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
