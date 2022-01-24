package ex1102;

import java.util.Scanner;

class Goods {
	public String name;
	public int price;
	public int numberOfStock;
	public int sold;
}

public class GoodsEx {
	
	public static void main(String[] args) {
		/*
		Goods shampoo = new Goods(); // 객체 생성, new와 함께 생성자 호출
		// 생성자가 정의되어 있지 않은 경우: 컴파일러가 기본 생성자를 만들어서 호출
		
		// 값 지정
		shampoo.name = "앨라스틴";
		shampoo.price = 13000;
		shampoo.numberOfStock = 30;
		shampoo.sold = 50;
		
		// 출력
		System.out.printf("상품 이름 : %s\n", shampoo.name);
		System.out.printf("상품 가격 : %d\n", shampoo.price);
		System.out.printf("재고 수량 : %d\n", shampoo.numberOfStock);
		System.out.printf("팔린 수량 : %d\n", shampoo.sold);
		*/
		
		Goods[] gArray = new Goods[3]; // 배열 객체 생성
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<gArray.length; i++) {
			gArray[i] = new Goods(); // Goods 객체 생성 후 참조
			gArray[i].name = scan.next();
			gArray[i].price = scan.nextInt();
			gArray[i].numberOfStock = scan.nextInt();
			gArray[i].sold = scan.nextInt();
		}
		
		// 출력
		System.out.println("상품명 가격 재고량 판매량");
		for(Goods g : gArray) {
			System.out.printf("%s %d %d %d\n", g.name, g.price, g.numberOfStock, g.sold);
		}
		
//		for(int i=0; i<gArray.length; i++) {
//			System.out.printf("%s %d %d %d\n", gArray[i].name,
//											   gArray[i].price, 
//								         	   gArray[i].numberOfStock, 
//									           gArray[i].sold);
//		}
		
	}
	
}
