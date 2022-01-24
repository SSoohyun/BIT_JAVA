package ex1110;

import java.util.Random;

class ATM {
	private int balance = 0;

	public ATM(int balance) {
		super();
		this.balance = balance;
	}

	public void getBalance() {
		System.out.printf("���� ATM �ܾ� : %d��\n", balance);
	}

	public void deposit(int amount, String name) {
		System.out.printf("%s �Ա� �ݾ� : %d��\n", name, amount);
		balance += amount; // �Ա�
	}

	public void withdraw(int amount, String name) {
		if (amount > balance) {
			System.out.printf("%s ��� �ݾ� : %d��\n", name, amount);
			System.out.println("ATM�� �ܾ��� ������ ����� �� �����ϴ�.");
		} else {
			System.out.printf("%s ��� �ݾ� : %d��\n", name, amount);
			balance -= amount; // ���
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
		ATM a = new ATM(30000); // �ʱ� �ܾ� 30000��
		new ATM_USER(a, "�̶�").start();
		new ATM_USER(a, "���").start();
		new ATM_USER(a, "�ڳ�").start();
	}
}
