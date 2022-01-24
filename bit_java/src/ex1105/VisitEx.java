package ex1105;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class Customer {
	private String name;
	private boolean member = false;
	private String memberType;
	
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	@Override
	public String toString() {
		return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}	
}

class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}
	
	public String getName() {
		return customer.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setServiceExpense(double serviceExpense) {
		// ��޿� ���� ���� ��� ���
		this.serviceExpense = serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
		
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public void setProductExpense(double productExpense) {
		// ȸ�����ο� ���� ��ǰ ��� ���
		this.productExpense = productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
		
	}
	
	public double getTotalExpense() {
		// �Ѿ� ���
		return getProductExpense() + getServiceExpense();
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // ��¥ ��� ������ ����
		return String.format("Visit[Customer=%s, Date=%s, ��ǰ���=%.1f, ���� ���=%.1f, �� ��� ���=%.1f��]"
							, customer, sdf.format(date), getProductExpense(), getServiceExpense(), getTotalExpense());
	}
}


class DiscountRate {
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type) {
		// type(���)�� null���� �ƴ��� �Ǻ��� ��
		// ��޿� ���� �������� ��ȯ
		if (type != null) {
			if(type.equals("Premium")) { // premium
				return serviceDiscountPremium;
			} else if("Gold".equals(type)) { // gold
				return serviceDiscountGold;
			} else { // silver
				return serviceDiscountSilver;
			}
		} else { // null: ȸ���� �ƴ�
			return 0;
		}
	}
	
	public static double getProductDiscountRate(String type) {
		// type(���)�� null���� �ƴ��� �Ǻ��� ��
		// ��޿� ���� �������� ��ȯ
		if (type != null) {
			if(type.equals("Premium")) { // premium
				return productDiscountPremium;
			} else if(type.equals("Gold")) { // gold
				return productDiscountGold;
			} else { // silver
				return productDiscountSilver;
			} 
		} else { // null: ȸ���� �ƴ�
			return 0;
		}
	}
}

public class VisitEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); // ���� �Լ�
		
		Customer[] c = new Customer[5]; // Customer ��ü �迭 ����
		
		// ȸ�� ���� �Է�
		for(int i=0; i<c.length; i++) {
			System.out.print("���� �̸�, ȸ������, ����� �Է��ϼ���>> ");
			c[i] = new Customer(scan.next()); // �̸� ����
			boolean isMem = scan.nextBoolean();
			c[i].setMember(isMem); // ȸ������
			
			// ȸ���̶�� if�� �ȿ��� ����� �Է¹ް�
			// ȸ���� �ƴ϶�� ���� �Է����� �Ѿ
			if(isMem) { 
				c[i].setMemberType(scan.next()); // ���	
			}
		}
		
//		Date date = null;
//		date = new Date(); // 11��		
//		date.setDate(rand.nextInt(30)+1);
				
		for(int i=0; i<c.length; i++) {
			Calendar cd = Calendar.getInstance();
			cd.set(2021, 10, rand.nextInt(30)+1); // ��¥ ����
			Visit v = new Visit(c[i], cd.getTime());
			int po = (rand.nextInt(20)+1)*1000; // ��ǰ ����
			int ps = (rand.nextInt(20)+1)*1000; // ���� ���
			v.setProductExpense(po); // ��ǰ ���� ����
			v.setServiceExpense(ps); // ���� ��� ����
			
			// ���
			System.out.printf("%s���� %d���� ��ǰ�� �����ϰ� %d���� ���񽺸� �����޾���\n", c[i].getName(), po, ps);
			System.out.println(v);
		}
		
	}

}
