package ex1110;

class ManyThread extends Thread {
	public ManyThread(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("�۾� �Ϸ�!" + getName());
	}
}

public class ManyThreadEx {

	public static void main(String[] args) {
		new ManyThread("Thread1").start();
		new ManyThread("Thread2").start();
	}

}
