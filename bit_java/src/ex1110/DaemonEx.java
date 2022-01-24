package ex1110;

class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ���� ����..");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			save();
		}
	}
}

public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);
		at.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���� ������ ����..");
	}
}
