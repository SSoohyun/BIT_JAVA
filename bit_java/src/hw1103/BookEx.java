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
		int menu = 0; // 메뉴 번호
		
		Book[] b = new Book[10]; // Book 정보를 저장할 배열
		int bookNum=0; // 도서 수
		
		BREAK: // 프로그램 종료 시 무한루프를 탈출
		while(true) {
			System.out.println("1.도서 정보 입력 | 2.도서 목록 보기 | 3.검색하기(제목) | "
								+ "4.수량정보(여성작가수량/보유도서수량) | 5.프로그램 종료");
			menu = scan.nextInt();
			
			// 메뉴 선택에 따라
			switch(menu) {
			case 1: // 도서 정보 입력
				System.out.println("책 제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시오 -->>");
				// 배열에 저장
				b[bookNum] = new Book(scan.next(), new Author(scan.next(), scan.next(), scan.next()), scan.nextDouble(), scan.nextInt());
				bookNum++;
				break;
			case 2: // 도서 목록 보기 --> 저장된 내용 불러와서 출력
				for(int i=0; i<bookNum; i++) {
					System.out.println(b[i].toString());
				}
				break;
			case 3: // 검색하기
				System.out.print("제목을 입력하세요 -->> ");
				// 배열에서 책 제목과 일치하는 요소 정보 출력
				String title = scan.next(); // 제목 입력
				for(int i=0; i<bookNum; i++) {
					if(title.equals(b[i].getTitle())) {
						System.out.println(b[i].toString());
					}
				}
				break;
			case 4: // 수량정보(여성작가수량/보유도서수량)
				int fNum = 0; // 여성 작가 수
				for(int i=0; i<bookNum; i++) {
					if(b[i].getAuthor().getGender().equals("f")) {
						fNum++;
					}
				}
				System.out.printf("여성 작가 도서/총 보유도서: (%d/%d)\n", fNum, bookNum);
				break;
			case 5: // 프로그램 종료
				break BREAK; // 루프 탈출
			}
		}

	}

}
