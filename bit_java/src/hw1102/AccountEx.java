package hw1102;

class Account {
	public int accountNo; // ���¹�ȣ
	public String name; // �̸�
	public double balance; // �ܾ�
	
	// ���� ���� �Է�
	public void insert(int a, String n, double amnt) {
		accountNo = a;
		name = n;
		balance = amnt;
	}
	
	// �ش� �ݾ� �Ա�
	public void deposit(double amnt) {
		balance += amnt;
		checkBalance();
	}
	
	// �ش� �ݾ� ���
	public void withdraw(double amnt) {
		if(balance >= amnt) {
			balance -= amnt;
			checkBalance();
		} else {
			System.out.println("�ܾ��� �����Ͽ� ����� �� ����!");
			checkBalance();
		}
	}
	
	// �ܾ� ���
	public void checkBalance() {
		System.out.printf("%s���� �ܾ��� %.1f�� �Դϴ�.\n", name, balance);
	}
	
	// ���� ���� ���
	public void display() {
		System.out.println("------------------------------");
		System.out.printf("���¹�ȣ : %d\n", accountNo);
		System.out.printf("������ : %s\n", name);
		System.out.printf("�ܾ� : %.1f��\n", balance);
		System.out.println("------------------------------");
	}
}

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account(); // ��ü ����
		
		ac.insert(11111, "�ڳ�", 10000);
		ac.display();
		ac.withdraw(20000);
		ac.deposit(30000);
		ac.withdraw(1500);
	}

}
