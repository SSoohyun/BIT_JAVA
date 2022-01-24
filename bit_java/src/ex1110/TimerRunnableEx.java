package ex1110;

class TimerRunnable implements Runnable {
	int n = 0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TimerRunnableEx {

	public static void main(String[] args) {
		Thread tr = new Thread(new TimerRunnable());
		tr.start();
	}

}
