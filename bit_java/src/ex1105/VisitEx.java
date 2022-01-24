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
		// 등급에 따른 서비스 비용 계산
		this.serviceExpense = serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType()));
		
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public void setProductExpense(double productExpense) {
		// 회원여부에 따른 제품 비용 계산
		this.productExpense = productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
		
	}
	
	public double getTotalExpense() {
		// 총액 계산
		return getProductExpense() + getServiceExpense();
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 날짜 출력 포맷을 지정
		return String.format("Visit[Customer=%s, Date=%s, 제품비용=%.1f, 서비스 비용=%.1f, 총 사용 비용=%.1f원]"
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
		// type(등급)이 null인지 아닌지 판별한 후
		// 등급에 따른 할인율을 반환
		if (type != null) {
			if(type.equals("Premium")) { // premium
				return serviceDiscountPremium;
			} else if("Gold".equals(type)) { // gold
				return serviceDiscountGold;
			} else { // silver
				return serviceDiscountSilver;
			}
		} else { // null: 회원이 아님
			return 0;
		}
	}
	
	public static double getProductDiscountRate(String type) {
		// type(등급)이 null인지 아닌지 판별한 후
		// 등급에 따른 할인율을 반환
		if (type != null) {
			if(type.equals("Premium")) { // premium
				return productDiscountPremium;
			} else if(type.equals("Gold")) { // gold
				return productDiscountGold;
			} else { // silver
				return productDiscountSilver;
			} 
		} else { // null: 회원이 아님
			return 0;
		}
	}
}

public class VisitEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); // 랜덤 함수
		
		Customer[] c = new Customer[5]; // Customer 객체 배열 생성
		
		// 회원 정보 입력
		for(int i=0; i<c.length; i++) {
			System.out.print("고객의 이름, 회원여부, 등급을 입력하세요>> ");
			c[i] = new Customer(scan.next()); // 이름 설정
			boolean isMem = scan.nextBoolean();
			c[i].setMember(isMem); // 회원여부
			
			// 회원이라면 if문 안에서 등급을 입력받고
			// 회원이 아니라면 다음 입력으로 넘어감
			if(isMem) { 
				c[i].setMemberType(scan.next()); // 등급	
			}
		}
		
//		Date date = null;
//		date = new Date(); // 11월		
//		date.setDate(rand.nextInt(30)+1);
				
		for(int i=0; i<c.length; i++) {
			Calendar cd = Calendar.getInstance();
			cd.set(2021, 10, rand.nextInt(30)+1); // 날짜 설정
			Visit v = new Visit(c[i], cd.getTime());
			int po = (rand.nextInt(20)+1)*1000; // 제품 가격
			int ps = (rand.nextInt(20)+1)*1000; // 서비스 비용
			v.setProductExpense(po); // 제품 가격 설정
			v.setServiceExpense(ps); // 서비스 비용 설정
			
			// 출력
			System.out.printf("%s님이 %d원의 제품을 구매하고 %d원의 서비스를 제공받았음\n", c[i].getName(), po, ps);
			System.out.println(v);
		}
		
	}

}
