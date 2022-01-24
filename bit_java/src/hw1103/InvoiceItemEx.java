package hw1103;

import java.util.Scanner;

class InvoiceItem {
	private String id; // 상품 아이디
	private String desc; // 상품명
	private int qty; // 구매 수량
	private double unitPrice; // 단가
	
	// 생성자
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	
	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotal() {
		return qty*unitPrice;
	}
	
	public String toString() {
		return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
}

public class InvoiceItemEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		InvoiceItem[] item = new InvoiceItem[3];
		
		for(int i=0; i<item.length; i++) {
			item[i] = new InvoiceItem(scan.next(), scan.next(), scan.nextInt(), scan.nextDouble());
		}
		
		for(InvoiceItem i : item) {
			System.out.printf("%s의 구매총액은 %.1f\n", i, i.getTotal());
		}
	}

}
