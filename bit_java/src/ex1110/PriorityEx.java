package ex1110;

class PriorityThread extends Thread {
	public PriorityThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print(i + "��° ");
			System.out.print("���� ���� ������ �̸�: " + Thread.currentThread().getName());
			System.out.println("--> ������ �켱 ����: " + Thread.currentThread().getPriority());
		}
	}
}

public class PriorityEx {

	public static void main(String[] args) {
		PriorityThread p1 = new PriorityThread("����");
		PriorityThread p2 = new PriorityThread("�߰���");
		PriorityThread p3 = new PriorityThread("����");
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
//		p1.setPriority(6);
//		p2.setPriority(5);
//		p3.setPriority(4);
		p1.start();
		p2.start();
		p3.start();
	}
}
