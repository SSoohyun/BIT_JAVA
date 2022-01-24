package hw1103;

class Account {
	private String id; // id
	private String name; // �̸�
	private int balance = 0; // �ܾ�
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this(id, name);
		this.balance = balance;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		System.out.printf("%s���� %d���� �Ա��Ͽ���\n", getName(), amount);
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.printf("%s���� %d���� ����Ͽ���\n", getName(), amount);
		} else {
			System.out.println("��ݾ��� �ܾ��ʰ�");
		}
		
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			balance -= amount;
			another.balance += amount;
			System.out.printf("%s���� %s�Կ��� %d���� �۱��Ͽ���\n", getName(), another.name, amount);
		} else {
			System.out.printf("%s�� %s���� %d�� �۱� �õ�\n", getName(), another.name, amount);
			System.out.println("�۱ݾ��� �ܾ��ʰ�!!");
		}
		
		return balance;
	}

	public String toString() {
		return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

public class AccountEx {

	public static void main(String[] args) {
		Account[] ac = new Account[3]; // ��ü �迭 ����
		
		System.out.println("�ʱ� ���� ����");
		ac[0] = new Account("11-111-111", "�ڳ�", 20000);
		ac[1] = new Account("22-222-222", "���", 100000);
		ac[2] = new Account("33-333-333", "�̶�", 50000);
		
		// �ʱ� ���� ���� ���
		for(Account a : ac) {
			System.out.println(a.toString());
		}
		
		// ����� �� �۱� ����
		System.out.println("-----------------------------------------------");
		ac[0].transferTo(ac[1], 30000);
		ac[0].deposit(50000);
		ac[0].transferTo(ac[1], 30000);
		ac[2].withdraw(4500);
		
		// ���� ���� ���� ���� ���� ���
		System.out.println("-----------------------------------------------");
		System.out.println("���� ���� ���� ���� ����");
		for(Account a : ac) {
			System.out.println(a.toString());
		}
		System.out.println("-----------------------------------------------");
		
	}

}
