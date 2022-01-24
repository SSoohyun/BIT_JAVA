package hw1103;

import java.util.Scanner;

class Author {
	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String toString() {
		return String.format("Author[name=%s, email=%s, gender=%s", getName(), getEmail(), getGender());
	}
}

class Book {
	private String title;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String title, Author author, double price, int qty) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return String.format("Book[title=%s, %s, price=%s, qty=%s]"
							 , getTitle()
							 , getAuthor().toString()
							 , getPrice()
							 , getQty());
	}
}

public class BookEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // �޴� ��ȣ
		
		Book[] b = new Book[10]; // Book ������ ������ �迭
		int bookNum=0; // ���� ��
		
		BREAK: // ���α׷� ���� �� ���ѷ����� Ż��
		while(true) {
			System.out.println("1.���� ���� �Է� | 2.���� ��� ���� | 3.�˻��ϱ�(����) | "
								+ "4.��������(�����۰�����/������������) | 5.���α׷� ����");
			menu = scan.nextInt();
			
			// �޴� ���ÿ� ����
			switch(menu) {
			case 1: // ���� ���� �Է�
				System.out.println("å ����, ����, �̸���, ����, ����, ���� ������ �Է��Ͻÿ� -->>");
				// �迭�� ����
				b[bookNum] = new Book(scan.next(), new Author(scan.next(), scan.next(), scan.next()), scan.nextDouble(), scan.nextInt());
				bookNum++;
				break;
			case 2: // ���� ��� ���� --> ����� ���� �ҷ��ͼ� ���
				for(int i=0; i<bookNum; i++) {
					System.out.println(b[i].toString());
				}
				break;
			case 3: // �˻��ϱ�
				System.out.print("������ �Է��ϼ��� -->> ");
				// �迭���� å ����� ��ġ�ϴ� ��� ���� ���
				String title = scan.next(); // ���� �Է�
				for(int i=0; i<bookNum; i++) {
					if(title.equals(b[i].getTitle())) {
						System.out.println(b[i].toString());
					}
				}
				break;
			case 4: // ��������(�����۰�����/������������)
				int fNum = 0; // ���� �۰� ��
				for(int i=0; i<bookNum; i++) {
					if(b[i].getAuthor().getGender().equals("f")) {
						fNum++;
					}
				}
				System.out.printf("���� �۰� ����/�� ��������: (%d/%d)\n", fNum, bookNum);
				break;
			case 5: // ���α׷� ����
				break BREAK; // ���� Ż��
			}
		}

	}

}
