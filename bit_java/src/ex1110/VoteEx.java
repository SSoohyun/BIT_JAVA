package ex1110;

import java.util.Random;

class Vote extends Thread {
	public Vote(String area) {
		super(area);
	}
	
	@Override
	public void run() {
		Random rand = new Random();
		
		int vote = 0;
		int rate = 0;
		
		while(true) {
//			if (vote == 100) {
//				return;
//			}
//			rate = rand.nextInt(5) + 1;
//			vote += rate;
//			String star = "";
//			for (int i = 0; i < vote; i++) {
//				star += "*";
//			}
//			
//			if (vote > 100) {
//				vote -= rate;
//				rate = 100 - vote;
//				vote += rate;
//				System.out.printf("%s ��ǥ�� : %d%%(��ǥ������ : %d%%)%s\n", Thread.currentThread().getName(), vote, rate, star);
//				return;
//			} else {
//				System.out.printf("%s ��ǥ�� : %d%%(��ǥ������ : %d%%)%s\n", Thread.currentThread().getName(), vote, rate, star);
//			}
			
			rate = rand.nextInt(5) + 1;
			if (vote + rate > 100) {
				rate = 100 - vote;
			}
			vote += rate;
			String star = "";
			for (int i = 0; i < vote; i++) {
				star += "*";
			}
			System.out.printf("%s ��ǥ�� : %d%%(��ǥ������ : %d%%)%s\n", Thread.currentThread().getName(), vote, rate, star);
			
			if (vote == 100) {
				return;
			}
			
			try {
				Thread.sleep(rand.nextInt(1000) + 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class VoteEx {

	public static void main(String[] args) {
		Vote v1 = new Vote("��1������");
		Vote v2 = new Vote("��2������");		
		Vote v3 = new Vote("��3������");
		
		v1.start();
		v2.start();
		v3.start();
	}

}
