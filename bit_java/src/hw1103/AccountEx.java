package hw1103;

class Account {
	private String id; // id
	private String name; // 이름
	private int balance = 0; // 잔액
	
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
		System.out.printf("%s님이 %d원을 입금하였음\n", getName(), amount);
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.printf("%s님이 %d원을 출금하였음\n", getName(), amount);
		} else {
			System.out.println("출금액이 잔액초과");
		}
		
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			balance -= amount;
			another.balance += amount;
			System.out.printf("%s님이 %s님에게 %d원을 송금하였음\n", getName(), another.name, amount);
		} else {
			System.out.printf("%s이 %s에게 %d원 송금 시도\n", getName(), another.name, amount);
			System.out.println("송금액이 잔액초과!!");
		}
		
		return balance;
	}

	public String toString() {
		return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

public class AccountEx {

	public static void main(String[] args) {
		Account[] ac = new Account[3]; // 객체 배열 생성
		
		System.out.println("초기 계좌 정보");
		ac[0] = new Account("11-111-111", "코난", 20000);
		ac[1] = new Account("22-222-222", "장미", 100000);
		ac[2] = new Account("33-333-333", "미란", 50000);
		
		// 초기 계좌 정보 출력
		for(Account a : ac) {
			System.out.println(a.toString());
		}
		
		// 입출금 및 송금 실행
		System.out.println("-----------------------------------------------");
		ac[0].transferTo(ac[1], 30000);
		ac[0].deposit(50000);
		ac[0].transferTo(ac[1], 30000);
		ac[2].withdraw(4500);
		
		// 은행 업무 이후 계좌 정보 출력
		System.out.println("-----------------------------------------------");
		System.out.println("은행 업무 이후 계좌 정보");
		for(Account a : ac) {
			System.out.println(a.toString());
		}
		System.out.println("-----------------------------------------------");
		
	}

}
