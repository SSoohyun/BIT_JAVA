package ex1103;

import java.util.Scanner;

class Customer {
	private int id;
	private String name;
	private int discount;
	
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String toString() {
		return String.format("%s(%d)", getName(), getId());
	}
}

class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName(); // 고객의 이름 정보는 customer가 참조
	}

	public double getAmountAfterDiscount() {
		return amount - (amount*customer.getDiscount()/100); // 마찬가지로 customer 참조
	}
}

public class InvoiceEx {

	public static void main(String[] args) {
//		Customer c = new Customer(1, "conan", 10);
//		Invoice i = new Invoice(111, c, 30000);
//		System.out.println(i.getAmountAfterDiscount());
//		System.out.println(i.getCustomerName());
		
		Scanner scan = new Scanner(System.in);
		
		// 객체 배열 생성
		Invoice[] iArray = new Invoice[3];
		
		// 정보 입력
		for(int i=0; i<iArray.length; i++) {
			System.out.println("상품아이디, 고객명, 할인율, 총액 순서대로 입력하세요 >>");
			iArray[i] = new Invoice(scan.nextInt(), new Customer(i+1, scan.next(), scan.nextInt()), scan.nextDouble());
		}
		
		// 결과 출력
		for(int i=0; i<iArray.length; i++) {
			System.out.printf("%s님께서 %d를 구매하고 총액 %.1f원에서 %d%% 할인 받아 최종 지불액은 %.1f원임\n"
							  , iArray[i].getCustomerName()
							  , iArray[i].getId()
							  , iArray[i].getAmount()
							  , iArray[i].getCustomer().getDiscount()
							  , iArray[i].getAmountAfterDiscount());
		}
			
	}

}
