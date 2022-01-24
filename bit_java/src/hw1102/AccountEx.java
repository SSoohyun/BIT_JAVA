package hw1102;

class Account {
	public int accountNo; // 계좌번호
	public String name; // 이름
	public double balance; // 잔액
	
	// 계좌 정보 입력
	public void insert(int a, String n, double amnt) {
		accountNo = a;
		name = n;
		balance = amnt;
	}
	
	// 해당 금액 입금
	public void deposit(double amnt) {
		balance += amnt;
		checkBalance();
	}
	
	// 해당 금액 출금
	public void withdraw(double amnt) {
		if(balance >= amnt) {
			balance -= amnt;
			checkBalance();
		} else {
			System.out.println("잔액이 부족하여 출금할 수 없음!");
			checkBalance();
		}
	}
	
	// 잔액 출력
	public void checkBalance() {
		System.out.printf("%s님의 잔액은 %.1f원 입니다.\n", name, balance);
	}
	
	// 계좌 정보 출력
	public void display() {
		System.out.println("------------------------------");
		System.out.printf("계좌번호 : %d\n", accountNo);
		System.out.printf("예금주 : %s\n", name);
		System.out.printf("잔액 : %.1f원\n", balance);
		System.out.println("------------------------------");
	}
}

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account(); // 객체 생성
		
		ac.insert(11111, "코난", 10000);
		ac.display();
		ac.withdraw(20000);
		ac.deposit(30000);
		ac.withdraw(1500);
	}

}
