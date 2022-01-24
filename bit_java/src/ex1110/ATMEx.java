package ex1110;

import java.util.Random;

class ATM {
	private int balance = 0;

	public ATM(int balance) {
		super();
		this.balance = balance;
	}

	public void getBalance() {
		System.out.printf("현재 ATM 잔액 : %d원\n", balance);
	}

	public void deposit(int amount, String name) {
		System.out.printf("%s 입금 금액 : %d원\n", name, amount);
		balance += amount; // 입금
	}

	public void withdraw(int amount, String name) {
		if (amount > balance) {
			System.out.printf("%s 출금 금액 : %d원\n", name, amount);
			System.out.println("ATM의 잔액이 부족해 출금할 수 없습니다.");
		} else {
			System.out.printf("%s 출금 금액 : %d원\n", name, amount);
			balance -= amount; // 출금
		}
	}
}

class ATM_USER extends Thread {
	ATM atm;

	public ATM_USER(ATM atm, String name) {
		super(name);
		this.atm = atm;
	}

	@Override
	public void run() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
			
			if (i % 2 == 0) {
				synchronized (atm) {
					atm.withdraw((rand.nextInt(20) + 1) * 1000, currentThread().getName());
					atm.getBalance();
				}
			} else {
				synchronized (atm) {
					atm.deposit((rand.nextInt(20) + 1) * 1000, currentThread().getName());
					atm.getBalance();
				}
			}
		}
	}
}

public class ATMEx {

	public static void main(String[] args) {
		ATM a = new ATM(30000); // 초기 잔액 30000원
		new ATM_USER(a, "미란").start();
		new ATM_USER(a, "장미").start();
		new ATM_USER(a, "코난").start();
	}
}
