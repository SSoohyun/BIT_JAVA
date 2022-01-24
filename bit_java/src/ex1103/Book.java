package ex1103;

public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("매개변수 3개 생성자 호출됨");
	}
	
	public Book(String title, int ISBN) {
		this(title, null, ISBN);
		System.out.println("매개변수 2개 생성자 호출됨");
	}
	
	public Book() {
		this(null, null, 0);
		System.out.println("기본 생성자 호출됨");
	}

	public static void main(String[] args) {
		Book b1 = new Book("날개", "이상", 3333);
		Book b2 = new Book("Holy Bible", 1);
		Book b3 = new Book();
	}

}
