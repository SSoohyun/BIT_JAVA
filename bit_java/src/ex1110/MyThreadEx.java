package ex1110;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "번: 작업 쓰레드");
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
		
//		thread.start(); // 종료한 쓰레드 다시 스타트 불가능
		
//		thread.run(); // 병렬 진행x, 작업 쓰레드 다 실행한 후 메인을 실행함
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "번: main 쓰레드");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
