package ex1103;

public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("�Ű����� 3�� ������ ȣ���");
	}
	
	public Book(String title, int ISBN) {
		this(title, null, ISBN);
		System.out.println("�Ű����� 2�� ������ ȣ���");
	}
	
	public Book() {
		this(null, null, 0);
		System.out.println("�⺻ ������ ȣ���");
	}

	public static void main(String[] args) {
		Book b1 = new Book("����", "�̻�", 3333);
		Book b2 = new Book("Holy Bible", 1);
		Book b3 = new Book();
	}

}
