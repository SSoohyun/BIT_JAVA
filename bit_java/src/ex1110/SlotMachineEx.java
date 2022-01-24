package ex1110;

import java.util.Random;

class SlotMachine extends Thread {
	public SlotMachine(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Random rand = new Random();
		
		while (true) {
			int num1 = rand.nextInt(10) + 1;
			int num2 = rand.nextInt(10) + 1;
			int num3 = rand.nextInt(10) + 1;

			System.out.printf("%s: %d  %d  %d\n", Thread.currentThread().getName(), num1, num2, num3);

			if (num1 == num2 && num1 == num3) {
				System.out.printf("%s 빙고!!! ==================\n", Thread.currentThread().getName());
				return;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SlotMachineEx {

	public static void main(String[] args) {
		SlotMachine s1 = new SlotMachine("코난");
		SlotMachine s2 = new SlotMachine("장미");
		SlotMachine s3 = new SlotMachine("미란");
		s1.start();
		s2.start();
		s3.start();
	}

}
