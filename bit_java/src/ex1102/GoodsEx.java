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
		Goods shampoo = new Goods(); // ��ü ����, new�� �Բ� ������ ȣ��
		// �����ڰ� ���ǵǾ� ���� ���� ���: �����Ϸ��� �⺻ �����ڸ� ���� ȣ��
		
		// �� ����
		shampoo.name = "�ٶ�ƾ";
		shampoo.price = 13000;
		shampoo.numberOfStock = 30;
		shampoo.sold = 50;
		
		// ���
		System.out.printf("��ǰ �̸� : %s\n", shampoo.name);
		System.out.printf("��ǰ ���� : %d\n", shampoo.price);
		System.out.printf("��� ���� : %d\n", shampoo.numberOfStock);
		System.out.printf("�ȸ� ���� : %d\n", shampoo.sold);
		*/
		
		Goods[] gArray = new Goods[3]; // �迭 ��ü ����
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<gArray.length; i++) {
			gArray[i] = new Goods(); // Goods ��ü ���� �� ����
			gArray[i].name = scan.next();
			gArray[i].price = scan.nextInt();
			gArray[i].numberOfStock = scan.nextInt();
			gArray[i].sold = scan.nextInt();
		}
		
		// ���
		System.out.println("��ǰ�� ���� ��� �Ǹŷ�");
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
